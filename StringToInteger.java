package Strings;

public class StringToInteger {
    public static void stringToInteger(String s){
        if(s.length() == 0) return;
        int res0 = Integer.parseInt(s);
        int res1 =Integer.valueOf(s);
        System.out.println(res0);
        System.out.println(res1);
    }

    public static void main(String[] args) {
        String s ="133";
        stringToInteger(s);
    }
}
