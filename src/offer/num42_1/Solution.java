package offer.num42_1;

import offer.tools.FullPrint;

/**
 * Created by byhieg on 2017/6/27.
 * Mail to byhieg@gmail.com
 */
public class Solution {

    public String LeftRotateString(String str,int n) {
        char[] chars = str.toCharArray();
        reverse(chars,0,n - 1);
        reverse(chars,n,chars.length - 1);
        reverse(chars,0,chars.length - 1);

        return String.valueOf(chars);
    }

    public void reverse(char[] chars,int a,int b){
        while(a < b){
            char tmp = chars[a];
            chars[a++] = chars[b];
            chars[b--] = tmp;
        }
    }

    public static void main(String[] args) {
        FullPrint.printResult(new Solution().LeftRotateString("abcdefg",2));
    }
}
