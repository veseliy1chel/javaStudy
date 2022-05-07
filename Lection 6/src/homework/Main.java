package homework;

public class Main {
    static final int size  = 100000000;
    static final int half = size/2;
    public static void main(String[] args) {
        method1();
        method2();
    }
    private static void method1(){
        float[] arr = new float[size];
        for(int i =0;i<size;i++){
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        for(int i = 0;i<size;i++){
            arr[i]=(float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis()-a);
    }
    private static void method2(){
        float[] arr = new float[size];
        for(int i =0;i<size;i++){
            arr[i]=1;
        }
        long a = System.currentTimeMillis();
        float[] arrF = new float[half];
        float[] arrS = new float[half];
        System.arraycopy(arr,0,arrF,0,half);
        System.arraycopy(arr,half,arrS,0,half);
        Thread one = new Thread(()->{
            for(int i =0;i<half;i++){
                arrF[i]=(float)(arrF[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        one.start();
        Thread two = new Thread(()->{
            for(int i =half;i<size;i++){
                arrS[i-half]=(float)(arrS[i-half] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        two.start();
        try{
            one.join();
            two.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.arraycopy(arrF,0,arr,0,half);
        System.arraycopy(arrS,0,arr,half,half);
        System.out.println(System.currentTimeMillis()-a);
    }
}
