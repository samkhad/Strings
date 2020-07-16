package Strings;

import java.util.Arrays;

public class CountVowelConsonant {
    public static int[] countVowelConsonant(String s){
        int[] result = new int[2];
        if(s.length() == 0) return result;
        int countVowel = 0;
        int countConst = 0;


        for(char ch : s.toCharArray()){
            switch(ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    countVowel++;
                    break;
                default:
                    countConst++;
                    break;
            }
        }
        result[0] = countVowel;
        result[1] =countConst;
        return result;
    }

    public static void main(String[] args) {
        String s = "cdbgiouutt";
        int[] res = countVowelConsonant(s);

        System.out.println(Arrays.toString(res));
    }
}
