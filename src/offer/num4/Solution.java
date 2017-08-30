package offer.num4;

/**
 * Created by byhieg on 2017/8/8.
 * Mail to byhieg@gmail.com
 */
public class Solution {
    public String replaceSpace(StringBuffer str) {
        if (str == null || str.length() == 0) {
            return "";
        }

        int originalLength = str.length();
        int newLength = originalLength;
        for (int i = 0; i < originalLength; i++) {
            if (str.charAt(i) == ' '){
                newLength += 2;
            }
        }

        int point1 = originalLength - 1;
        int point2 = newLength - 1;
        str.setLength(newLength);
        while (point1 != point2){
            if (str.charAt(point1) != ' '){
                str.setCharAt(point2,str.charAt(point1));
                point1--;
                point2--;
            }else{
                str.setCharAt(point2,'0');
                point2--;
                str.setCharAt(point2,'2');
                point2--;
                str.setCharAt(point2,'%');
                point2--;
                point1--;
            }
        }
        return str.toString();

    }
}
