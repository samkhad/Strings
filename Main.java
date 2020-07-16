package Strings;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("testing-Duplicate Characters");
        String s="aabcdeeff";
        DuplicateCharacters ds = new DuplicateCharacters();
        List<Character> result  = ds.duplicateCharacters(s);
        System.out.println(result.toString());
        System.out.println("testing is anagram");
        IsAnagram ia = new IsAnagram();
        String A= "abdef";
        String B ="abmef";
        boolean res = ia.isAnagram(A,B);
        System.out.println(A + " and "+ B + " are anagrams =  "+ res);


    }
}
