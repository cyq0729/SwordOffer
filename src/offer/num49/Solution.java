package offer.num49;

/**
 * Created by byhieg on 2017/6/29.
 * Mail to byhieg@gmail.com
 */
public class Solution {
    public int StrToInt(String str) {

        if (str == null || str.length() == 0) {
            return 0;
        }

        char[] chars = str.toCharArray();
        int res = 0;
        boolean isPostive = true;
        if (chars[0] == '-') {
            isPostive = false;
        }else if (chars[0] >= '0' && chars[0] <= '9') {
            res = Integer.parseInt(chars[0] + "");
        }else if(chars[0] == '+'){
            isPostive = true;
        }else{
            return 0;

        }

        for(int i = 1;i < chars.length;i++){
            if (chars[i] >= '0' && chars[i] <= '9') {
                res = res * 10 + Integer.parseInt(chars[i] + "");
            }else{
                return 0;
            }
        }
        if(isPostive){
            return res;
        }else{
            return 0 - res;
        }

    }

}
