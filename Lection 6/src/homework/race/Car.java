package homework.race;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

class Car implements Runnable {
    private static int CARS_COUNT;
    private static Object monitor = new Object();
    private static boolean haveWinner = false;
    static {
        CARS_COUNT = 0;
    }
    private CyclicBarrier cb;
    private Race race;
    private int speed;
    private String name;
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed,CyclicBarrier cb) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
        this.cb = cb;
    }
    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            cb.await();
            cb.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
            if(race.getStages().get(i)==race.getStages().get(race.getStages().size()-1)){
                try{
                    cb.await();
                    synchronized (monitor){
                        if(haveWinner){
                            System.out.println(this.name+ "  - Winner!!");
                        }
                    }

                }catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }


            }
        }
    }
}
