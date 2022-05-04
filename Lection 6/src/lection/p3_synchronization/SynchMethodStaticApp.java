package lection.p3_synchronization;

public class SynchMethodStaticApp {
    public static void main(String[] args) {
        SynchMethodStaticApp e = new SynchMethodStaticApp();
        new Thread(()->e.classMethod()).start();
        new Thread(()->e.objectMethod()).start();
    }
    public synchronized static void classMethod(){
        System.out.println("Synch Static Method Start!!");
        for(int i =0;i<10;i++){
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Synch Static Method END!!");
    }
    public synchronized void objectMethod(){
        System.out.println("Synch Object Method START!!");
        for(int i = 0;i<10;i++){
            try{
                Thread.sleep(100);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Synch Object Method END!!");
    }
}
