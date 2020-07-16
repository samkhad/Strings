package Strings;

public class IntToString {
    public static String intToString(int x){
        boolean isNegative = false;
        if(x <0){
            isNegative = true;
        }
        StringBuilder sb = new StringBuilder();
       do{
           sb.append((char)  ('0' + Math.abs(x % 10)));
            x /= 10;
       } while(x != 0);
       return sb.append(isNegative ? "-":"").reverse().toString();
    }


    public static void main(String[] args) {
        int x =-556;
        String s = intToString(x);
        System.out.println(s);
    }
}
