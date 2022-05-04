package lection.p4_deadlock;

public class DeadlockApp {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();
    public static void main(String[] args) {
        DeadThreadOne one = new DeadThreadOne();
        DeadThreadTwo two = new DeadThreadTwo();
        one.start();
        two.start();
    }
    private static class DeadThreadOne extends Thread{
        @Override
        public void run() {
            synchronized (lock1){
                System.out.println("DeadThreadOne is holding LOCK 1....");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("DeadThreadOne is waiting of LOCK 2 .....");
                synchronized (lock2){
                    System.out.println("DeadThreadOne is holding LOCK 2....");
                }
            }

        }
    }
    private static class DeadThreadTwo extends Thread{
        @Override
        public void run() {
            synchronized (lock2){
                System.out.println("DeadThreadTwo is holding LOCK 2....");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("DeadThreadTwo is waiting of LOCK 1 .....");
                synchronized (lock1){
                    System.out.println("DeadThreadTwo is holding LOCK 1....");
                }
            }
        }
    }
}
