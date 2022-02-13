import MyException.MyArrayDataException;
import MyException.MyArraySizeException;

public class Main3{
    public static void main(String[] args) {
        String[][] arr = {{"3","6","6","1"},{"5","234","s","4"},{"2","3","235","23"},{"75","26","7","85"},{"3"}};
        try{
            System.out.println(arrayChecker(arr));
        }catch (MyArrayDataException e){
            e.printStackTrace();
        }catch (MyArraySizeException e){
            e.printStackTrace();
        }
    }
    public static int arrayChecker(String[][] arr)throws MyArraySizeException, MyArrayDataException {
        if(arr.length!=4||arr[0].length!=4) throw new MyArraySizeException();
        int sum = 0;


        for(int i =0;i<4;i++){
            for(int j =0;j<4;j++){
                try{
                    sum+=Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return sum;

    }
}
