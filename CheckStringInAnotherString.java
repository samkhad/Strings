package Strings;

public class CheckStringInAnotherString {
    public static int indexOfString(String s1, String s2){

        if(s1.length() == 0) return -1;
        int res = s1.contains(s2)? s1.indexOf(s2): -1;
        return res;
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "acdb";
        int res = indexOfString(s1,s2);
        System.out.println(res);
    }
}
