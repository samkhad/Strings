package Strings;

public class StringToInt {
    public static String replaceAby2DandRemoveB(String s){
        String b = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<b.length();i++){
            if(b.charAt(i) == 'a'){
                sb.append('d').append('d');
            }
            else if(b.charAt(i) == 'b'){
                sb.append("");
            }
            else{
                sb.append(b.charAt(i));
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String s = "aabcdbcdda";
        String res = replaceAby2DandRemoveB(s);
        System.out.println(res);

    }
}
