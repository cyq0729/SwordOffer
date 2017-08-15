package offer.num33;

import offer.tools.FullPrint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by byhieg on 17/6/17.
 * Mail to byhieg@gmail.com
 */
public class Solution {

    public String PrintMinNumber(int [] numbers) {
        ArrayList<String> strs = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            strs.add(numbers[i] + "");
        }
        Collections.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return isBigger(o1,o2);
            }
        });

        StringBuilder res = new StringBuilder("");
        for (int i = 0; i < strs.size(); i++) {
            res.append(strs.get(i));
        }
        return res.toString();
    }

    public int isBigger(String a,String b){
        String c = a + b;
        String d = b + a;
        return c.compareTo(d);
    }


    public static void main(String[] args) {
        FullPrint.printResult(new Solution().PrintMinNumber(new int[]{
                3,32,321
        }));
    }

}
