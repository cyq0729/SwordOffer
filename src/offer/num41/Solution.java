package offer.num41;

import java.util.ArrayList;

/**
 * Created by byhieg on 2017/6/27.
 * Mail to byhieg@gmail.com
 */
public class Solution {

    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int small = 1;
        int big = 2;
        if (sum == 0) {
            return res;
        }

        while(small <= (1 + sum) / 2){
            ArrayList<Integer> arr = new ArrayList<>();
            if (getContinuousSum(small,big) < sum) {
                big++;
            }else if (getContinuousSum(small,big) > sum) {
                small++;

            }else{
                for (int i = small; i <= big; i++) {
                    arr.add(i);
                }
                res.add(arr);
                small++;
                big++;
            }
        }

        return res;

    }

    public int getContinuousSum(int small,int big){
        return (big - small + 1) * (big + small) / 2;
    }
}
