import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TelephoneDictionary {
    HashMap<String,String> dictionary;

    public TelephoneDictionary(String number,String surname) throws NumberFormatException{


        try {
            this.dictionary.put(number, surname);
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
    public TelephoneDictionary(){
        this.dictionary= new HashMap<>();
    }

    public void addTelephone(String number,String surname) {
            this.dictionary.put(number, surname);

    }
    public void getTelephone(String surname){
        Map result = dictionary.entrySet().stream().filter(s-> s.getValue().equals(surname)).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(result);
    }
}
