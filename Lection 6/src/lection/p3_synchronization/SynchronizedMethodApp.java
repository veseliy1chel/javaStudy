package lection.p3_synchronization;

import java.sql.SQLOutput;

public class SynchronizedMethodApp {
    public static void main(String[] args) {
        SynchronizedMethodApp e1 = new SynchronizedMethodApp();
        SynchronizedMethodApp e2 = new SynchronizedMethodApp();
        
        new Thread(()->e1.method1()).start();
        new Thread(()->e1.method2()).start();
        new Thread(()->e1.method3()).start();
    }
    public synchronized void method1(){
        System.out.println("M1 - Start!!");
        for(int i = 0;i<10;i++){
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("M1 - END!!");

    }
    public synchronized void method2(){
        System.out.println("M2 - Start!!");
        for(int i = 0;i<10;i++){
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("M2 - END!!");

    }
    public void method3(){
        System.out.println("M3 - Start!!");
        for(int i = 0;i<10;i++){
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("M3 - END!!");

    }
}
