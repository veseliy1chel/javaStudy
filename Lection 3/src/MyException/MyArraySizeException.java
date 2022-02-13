package MyException;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(){
        System.err.println("MyArraySizeException:  Wrong Array size");
    }
    public MyArraySizeException(String str){
        System.err.println("MyArraySizeException:  "+str);
    }

}
