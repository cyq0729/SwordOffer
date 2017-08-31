package offer.num42_2;

import offer.tools.FullPrint;

/**
 * Created by byhieg on 2017/6/27.
 * Mail to byhieg@gmail.com
 */
public class Solution {

    public String ReverseSentence(String str) {
        if(str == null){ return null;}
        if(str.trim().equals("")){
            return str;
        }
        String s = new StringBuilder(str).reverse().toString();
        String[] ss = s.split(" ");
        StringBuilder sb = new StringBuilder("");
        for(String str1 : ss){
            sb.append(new StringBuilder(str1).reverse().toString()).append(" ");
        }
        String res = sb.toString();
        return res.substring(0,res.length() - 1);

    }

    public String ReverseSentence1(String str){
        if (str == null) {
            return null;
        }
        if (str.trim().equals("")) {
            return str;
        }
        char[] chars = str.toCharArray();
        if (str.contains(" ")) {
            reverse(chars,0,str.length() - 1);
        }else{
            return str;
        }
        int headPoint = 0;
        int endPoint = 0;
        while (endPoint <= str.length() - 1){
            if (endPoint == str.length() - 1) {
                reverse(chars,headPoint,endPoint);
                endPoint++;
            }else if (chars[endPoint] != ' '){
                endPoint++;
            }else{
                reverse(chars,headPoint,endPoint - 1);
                endPoint++;
                headPoint = endPoint;
            }
        }

        return String.valueOf(chars);

    }

    public void reverse(char[] chars,int a,int b){
        while (a <= b) {
            char tmp = chars[a];
            chars[a] = chars[b];
            chars[b] = tmp;
            a++;
            b--;
        }
    }

    public static void main(String[] args) {
        FullPrint.printResult(new Solution().ReverseSentence1("Hello World!"));
    }

}
