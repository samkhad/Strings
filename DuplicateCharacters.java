package Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateCharacters {
    public static List<Character> duplicateCharacters(String s){
        List<Character> result = new ArrayList<>();
        if (s.length()==0) return  result;
        HashSet<Character> set = new HashSet<>();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (set.contains(ch)){
                result.add(ch);
            }
            else{
                set.add(ch);
            }
        }
        return result;
    }
}
