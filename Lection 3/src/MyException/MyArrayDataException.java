package MyException;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int i,int j){
        System.err.println("MyArrayDataException : wrong type of value in array["+i+","+j+"]");
    }

    public MyArrayDataException(){
        System.err.println("MyArrayDataException: wrong type of value in array,but you missing entering this value");
    }

}
