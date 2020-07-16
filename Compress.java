package Strings;

public class Compress {
    public static int compress(char[] chars) {
        int count =1;
        StringBuilder sb = new StringBuilder();

        for(int i=1;i<chars.length-1;i++){
            if (chars[i] == chars[i-1]){
                count++;
            }else{
                sb.append(chars[i-1]).append(count);
                count=1;
            }
        }
        sb.append(chars[chars.length -1]).append(count);
        return sb.toString().length();
    }

    public static void main(String[] args) {
        char[] ch = {'a','a','b','b','c','c','c'};
        int l = compress(ch);
        System.out.println(l);

    }
}
