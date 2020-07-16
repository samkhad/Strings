package Strings;

public class DefangingIPAddress {
    public static String defangIPAddress(String IP){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < IP.length();i++){
            char ch =IP.charAt(i);
            if(ch =='.'){
                sb.append("[.]");
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "1.1.1.1";
        String res = defangIPAddress(s1);
        System.out.println(res);

        String s2 = "255.100.50.0";
        String res1 = defangIPAddress(s2);
        System.out.println(res1);
    }
}
