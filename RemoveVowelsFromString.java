package Strings;

public class RemoveVowelsFromString {
    public static String removeVowelsFromString(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i< s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'){
                sb.append("");
            }
            else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s ="apple";
        String res = removeVowelsFromString(s);
        System.out.println(res);
        String s1="sdtt";
        String res1 = removeVowelsFromString(s1);
        System.out.println(res1);
    }
}
