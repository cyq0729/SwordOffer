package offer.num35;

import java.lang.instrument.Instrumentation;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by byhieg on 17/6/18.
 * Mail to byhieg@gmail.com
 */
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if(str == null || "".equals(str)){
            return -1;
        }
        Map<String,Integer> maps = new LinkedHashMap<>();

        for(int i = 0 ; i < str.length();i++){
            String s = str.charAt(i) + "";
            if(maps.containsKey(s)){
                maps.put(s,2);
            }else{
                maps.put(s,1);
            }
        }
        Set<String> set = maps.keySet();
        for (String key : set) {
            int value = maps.get(key);
            if (value == 1) {
                return str.indexOf(key);
            }
        }

        return 0;
    }

}
