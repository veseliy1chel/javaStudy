import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Stream;

public class Lection5Main {
    public static void main(String[] args) {
        TelephoneDictionary telephoneDictionary = new TelephoneDictionary();
        telephoneDictionary.addTelephone("+380731857590","Sergey");
        telephoneDictionary.addTelephone("+380501032630","Sergey");
        telephoneDictionary.addTelephone("+380671358123","Andrey");
        telephoneDictionary.getTelephone("Sergey");
    }
    public static void task1(){
        String[] arr = {"Hello","Hi","Main","Main","Base","Hello","platoon","method","uniqal","danke","error","Exception","Exception",
                "Hello","base","Base","Account","Crack","Crack","Account"};
        //filter unique values
        HashSet<String> set = new HashSet<>(Arrays.asList(arr));
        // create Map for saves words and count of their using
        HashMap<String,Integer> map = new HashMap<>();
        for(String str:set){
            map.put(str,(int)Arrays.stream(arr).filter(s -> s==str).count());
        }
        System.out.println(map);
    }

}
