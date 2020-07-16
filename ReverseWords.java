package Strings;

import java.util.Arrays;

public class ReverseWords {
    public static String reverseWords(String s){
        StringBuilder sb = new StringBuilder();
        String[] st = s.split("\\s");
        System.out.println(Arrays.toString(st));
        for(int i=st.length-1;i>=0;i--){
            sb.append(st[i]).append(" ");
        }
        String sa = sb.toString().trim();
        return sa;
    }

    public static String reverseEachLetterInWordsReverseInString(String s) {

        String[] strArr = s.split("\\s");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 =new StringBuilder();
        for(int i=0;i<strArr.length;i++){
            String word=strArr[i];
            sb = reverseTT(word);
            sb.append(" ");
            sb1.append(sb);
        }
        return sb1.toString().trim();
    }
    private static StringBuilder reverseTT(String word){
        StringBuilder sb = new StringBuilder();
        for(int i=word.length()-1;i>=0;i--){
            sb.append(word.charAt(i));
        }
        return sb;
    }


    public static void main(String[] args){
        String s ="Let's take LeetCode contest";
        String res = reverseEachLetterInWordsReverseInString(s);
        System.out.println(res);

    }
}
