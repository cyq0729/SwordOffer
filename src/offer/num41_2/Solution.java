package offer.num41_2;

import java.util.ArrayList;

/**
 * Created by byhieg on 2017/6/27.
 * Mail to byhieg@gmail.com
 */
public class Solution {

    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        if (sum == 0) {
            return res;
        }
        int small = 0;
        int big = array.length - 1;
        int a = 0;
        int b = 0;

        int product = Integer.MAX_VALUE;
        while(small < big){
            if (array[small] + array[big] < sum) {
                small++;
            }else if(array[small] + array[big] > sum){
                big--;
            }else{
                if(product > array[small] * array[big]){
                    a = array[small];
                    b = array[big];
                    product = a * b;
                }
                small++;
                big--;
            }
        }
        if(a == 0){
            return res;
        }
        res.add(a);
        res.add(b);
        return res;

    }
}
