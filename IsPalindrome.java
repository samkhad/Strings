package Strings;

public class IsPalindrome {
    public static boolean isPalindorme(String s){
        for(int i=0,j=s.length()-1; i<j;i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "racecar";
        boolean  isPalind = isPalindorme(s);
        System.out.println(isPalind);
        String s1 = "ambbgma";
        boolean isPalind1 = isPalindorme(s1);
        System.out.println(isPalind1);
    }
}
