package Strings;

import java.util.HashMap;

public class FirstNonRepeatingCharInString {
    public static void firstNonRepeatingCharInString(String s){
        if (s.length() == 0) return;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(map.get(ch), 0)+1);
        }
        for(int i=0;i< s.length();i++){
            char ch = s.charAt(i);
            int val = map.get(ch);
            if(val == 1){
                System.out.println(ch);
                break;
            }
        }
    }

    public static void main(String[] args) {
        String s ="abcda";
        firstNonRepeatingCharInString(s);


    }
}
