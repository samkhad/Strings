package Strings;

import java.util.HashMap;
import java.util.Map;

public class PrintCountOfRepeatedCharacters {
    public static void printRepeatedChars(String s){
        if (s.length() == 0 ) return;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0; i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
           if (entry.getValue() > 1){
               System.out.println(entry.getKey() + " is repeated  " + entry.getValue());
           }
        }
    }

    public static void main(String[] args) {
        String s = "aabcccldeeeee";
        printRepeatedChars(s);
    }
}
