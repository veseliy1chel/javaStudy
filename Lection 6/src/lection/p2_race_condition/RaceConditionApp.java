package lection.p2_race_condition;

public class RaceConditionApp {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread incThread = new Thread(()->{
            for(int i =0; i<1000;i++) {
                counter.inc();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread decThread = new Thread(()->{
            for(int i =0; i<1000;i++){
                counter.decr();
                try{
                    Thread.sleep(5);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        try{
            incThread.start();
            decThread.start();
            incThread.join();
            decThread.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("value is "+counter.value());
    }
}