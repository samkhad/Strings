package Strings;

public class CountOfGivenCharacter {
    public static int countOfGivenCharInString(String s, char ch){
        if (s.length()== 0 ) return 0;
        int count = 0;
        s.toLowerCase();
        char given = Character.toLowerCase(ch);
        for(char temp : s.toCharArray()){
            if (temp == given){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "assdefaabaaa";
        char c = 's';
        int res = countOfGivenCharInString(s, c);
        System.out.println(res);
    }
}
