package homework;

public class Main {
    static final int size  = 100000;
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
        new Thread(()->{
            for(int i =0;i<half;i++){
                arrF[i]=(float)(arrF[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }).start();
        new Thread(()->{
            for(int i =0;i<half;i++){
                arrS[i]=(float)(arrS[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }).start();
        System.arraycopy(arrF,0,arr,0,half);
        System.arraycopy(arrS,0,arr,half,half);
        System.out.println(System.currentTimeMillis()-a);
    }
}
