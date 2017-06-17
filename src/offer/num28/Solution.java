package offer.num28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * Created by shiqifeng on 2017/6/15.
 * Mail byhieg@gmail.com
 */
public class Solution {

    public ArrayList<String> Permutation(String str) {
        if (str == null || str.length() == 0){
            return new ArrayList<>();
        }
        TreeSet<String> set = new TreeSet<>();
        char[] chars = str.toCharArray();
        Permutation(chars, 0, set);
        return new ArrayList<>(set);
    }

    public void Permutation(char[] chars, int begin, TreeSet result) {
        if (chars.length == 0 || chars == null || begin < 0 || begin > chars.length - 1) {
            return;
        }
        if (begin == chars.length - 1) {
            result.add(String.valueOf(chars));
        }else{
            for (int i = begin; i < chars.length; i++) {
                //交换开始字符与后面的每个字符
                swap(chars, begin, i);
                //递归这个函数
                Permutation(chars, begin + 1, result);
                //还原这个字符串
                swap(chars, begin, i);
            }
        }

    }

    public void swap(char[] chars, int a, int b) {
        char tmp = chars[a];
        chars[a] = chars[b];
        chars[b] = tmp;
    }


    public static void main(String[] args) {
        ArrayList<String> result = new Solution().Permutation("bca");
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

}
