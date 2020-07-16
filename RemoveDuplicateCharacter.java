package Strings;

import java.util.HashSet;

public class RemoveDuplicateCharacter {

    public static String removeDuplicates(String s){
        if (s.length() == 0){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for (char ch: s.toCharArray()){
            if (!set.contains(ch)){
                set.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aabcdd";
        String res = removeDuplicates(s);
        System.out.println(res);
    }
}
