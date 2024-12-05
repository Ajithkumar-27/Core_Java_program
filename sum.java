import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class sum{
    public static void main(String[] args) {
        String str = "AjithkumaranN";
        String str1=str.toLowerCase();
        dupsum(str1);
    }
    public static void dupsum(String str1) {
        Map<Character, Integer> chMap = new HashMap<>();
        for (char c : str1.toCharArray()) {
            if (chMap.containsKey(c)) {
                chMap.put(c, chMap.get(c) + 1);
            } else {
                chMap.put(c,1);
            }
        }
        for (Map.Entry<Character, Integer> entry : chMap.entrySet()) {
            if (entry.getValue() >= 2) {
                System.out.println(entry.getKey()+ " = "+ entry.getValue());
            }
        }
    }
}
