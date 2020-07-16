package Strings;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int longestNonRepeatingChas(String s){
        HashSet<Character> set = new HashSet<>();
        int i = 0;
        int j =0;
        int max =0;
        while (j < s.length()){
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                max= Math.max(max, set.size());
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "pwwkewad";
        int l = longestNonRepeatingChas(s);
        System.out.println(l);
    }
}
