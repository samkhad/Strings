package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPMatcher {
    public static String ipMatcher(String IP){

        String ipv4 ="(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
        Pattern pattern = Pattern.compile(ipv4);
        Matcher matcher = pattern.matcher(IP);
        if(matcher.matches()){
            return "IPv4";
        }

        String ipv6 ="((([0-9a-fA-F]){1,4})\\:){7}(([0-9a-fA-F]){1,4})";
        Pattern pattern6 = Pattern.compile(ipv6);
        Matcher matcher1 = pattern6.matcher(IP);
        if(matcher1.matches()){
            return "IPv6";
        }
        return "Neither";
    }

    public static void main(String[] args) {
        String ipv4= "172.16.254.1";
        String  res = ipMatcher(ipv4);
        System.out.println(res);

        String ipv6="2001:0db8:85a3:0:0:8A2E:0370:7334";
        String res1 = ipMatcher(ipv6);
        System.out.println(res1);

        String ipNeith ="256.256.256.256";
        String res2 = ipMatcher(ipNeith);
        System.out.println(res2);
    }
}
