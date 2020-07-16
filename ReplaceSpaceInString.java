package Strings;

public class ReplaceSpaceInString {


    public static String replaceSpaceInString(String s){
        if(s.length() == 0 ) return null;
        String a = s.trim();
        StringBuilder sb = new StringBuilder();
        char[] charArr = a.toCharArray();
        for(char temp : charArr){
            if(temp == ' '){
                sb.append("%20");
            }else{
                sb.append(temp);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = " Mr John Smith ";
        String res = replaceSpaceInString(s);
        System.out.println(res);
    }
}
