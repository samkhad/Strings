package Strings;

import java.util.regex.Pattern;

public class IsStringNumeric {
    public static boolean isStringNumeric(String s){
        Pattern pattern = Pattern.compile(".*[^0-9].*");
        if(!pattern.matcher(s).matches()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "1123";
        String s2 = "abc12";
        String s3 = "abc";
        System.out.println("is "+ s1 + " numeric only = "+ isStringNumeric(s1));
        System.out.println("is  "+ s2 + " numeric only = "+ isStringNumeric(s2));

        System.out.println("is  "+ s3 + " numeric only = " + isStringNumeric(s3));
    }
}
