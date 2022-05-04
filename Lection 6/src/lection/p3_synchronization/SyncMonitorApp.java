package lection.p3_synchronization;

public class SyncMonitorApp {
    private Object monitor = new Object();

    public static void main(String[] args) {
        SyncMonitorApp e1 = new SyncMonitorApp();
        new Thread(()->e1.method1()).start();
        new Thread(()->e1.method1()).start();
        new Thread(()->e1.method1()).start();
    }
    public void method1(){
        try{
            System.out.println("NonSynch-Begin "+Thread.currentThread().getName());
            for(int i =0;i<3;i++){
                System.out.println(".");
                Thread.sleep(1000);
            }
            System.out.println("NonSynch-End "+ Thread.currentThread().getName());
            synchronized (monitor){
                System.out.println("Synch-Begin "+ Thread.currentThread().getName());
                for(int i =0;i<3;i++){
                    System.out.println(".");
                    Thread.sleep(1000);
                }
                System.out.println("Synch-End " + Thread.currentThread().getName());
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
