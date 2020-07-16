package Strings;

public class ReverseString {
    public static String reverseString(String s){
        if (s.length() < 2) return s;
      StringBuilder sb = new StringBuilder();
      for(int i = s.length()-1;i >=0; i--){
          sb.append(s.charAt(i));
      }
return sb.toString();
    }

    public static void main(String[] args) {
        String A = "battey";
        System.out.println(reverseString(A));

    }
}
