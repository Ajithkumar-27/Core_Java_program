import java.util.HashMap;
import java.util.Set;

public class CountString{
    public static void countcharacterinString(String str){
        String str1 = str.toLowerCase();
        char[] ch = str1.toCharArray();
        HashMap<Character,Integer> value= new HashMap<>();
        for(char n : ch){
            if(value.containsKey(n )){
                value.put(n,value.get(n)+1);
            }
            else{
                value.put(n,1);
            }
        }
        for(HashMap.Entry<Character,Integer> entry:value.entrySet()){
             System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static void main(String args[]){
        countcharacterinString("Ajithkumarjsgdjdhaiusj");
    }
}