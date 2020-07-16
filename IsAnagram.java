package Strings;

public class IsAnagram {
    public static boolean isAnagram(String A, String B){
        if (A.length() != B.length()) return false;
        int[] chars_val = new int[256];
        for(char ch: A.toCharArray()){
            chars_val[ch]++;
        }
        for(char ch: B.toCharArray()){
            chars_val[ch]--;
        }
        for(int i:chars_val){
            if(i != 0) return false;
        }
        return true;
    }
}
