package Strings;

import java.util.HashMap;
import java.util.Map;

public class MaximumRepeatedCharacter {
    public static int maxRepeatedChar(String s){
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int max =0;
      for(Map.Entry<Character, Integer> entry: map.entrySet()){
          char ch = entry.getKey();
          int val  = entry.getValue();
          if(max< val){
              max = val ;
          }
      }
      return max;
    }
}
