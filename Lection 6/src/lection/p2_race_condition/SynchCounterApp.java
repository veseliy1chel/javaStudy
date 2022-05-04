package lection.p2_race_condition;

public class SynchCounterApp {
    public static void main(String[] args) {
        SynchCounter synchCounter = new SynchCounter();

        Thread incThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0;i<1000;i++){
                    synchCounter.inc();
                    try{
                        Thread.sleep(5);

                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread decThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0;i<1000;i++){
                    synchCounter.dec();
                    try{
                        Thread.sleep(5);

                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        try{
            incThread.start();
            decThread.start();
            incThread.join();
            decThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("value is - "+ synchCounter.value());
    }
}
