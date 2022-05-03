package lection.p1_creation_and_base;

import javax.print.DocFlavor;

public class DaemonClassExample {
    public static void main(String[] args) {
        Thread tTimer = new Thread(()->{
            int time = 0;
            while(true){
                try{
                    Thread.sleep(1000);
                    time++;
                    System.out.println("Time - "+time);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        });
        tTimer.setDaemon(true);
        tTimer.start();
        System.out.println("Main start!");
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Main end!!");
    }
}
