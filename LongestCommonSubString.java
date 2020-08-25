package Strings;

public class LongestCommonSubString {
    public static String longestCommonSubstring(String a, String b){
        if(a.length() == 0|| b.length() == 0) return null;
        int[][]dp = new int[a.length()][b.length()];
        int max= Integer.MIN_VALUE;
        String str = "";
        for(int i = 0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
                if(a.charAt(i) == b.charAt(j)){
                    if(i==0 || j==0){
                        dp[i][j] = 1;
                    }else{
                        dp[i][j] = 1+dp[i-1][j-1];
                    }

                    if(dp[i][j] > max){
                        max= dp[i][j];
                        str = a.substring(i+1-max, i+1);
                    }else if (dp[i][j] == max){
                        str = a.substring(i+1-max, i+1);
                    }
                }
                else{
                    dp[i][j] = 0;
                }
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String a ="abcdeeaf";
        String b ="zbscsdsesf";
        String res = longestCommonSubstring(a,b);
        System.out.println(res);
    }
}
