package offer.num40;

/**
 * Created by byhieg on 2017/6/27.
 * Mail to byhieg@gmail.com
 */
public class Solution {

    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {

        if(array == null || array.length == 0){
            return;
        }

        num1[0] = 0;
        num2[0] = 0;

        int res = 0;
        for(int arr: array){
            res = arr ^ res;
        }

        int rightOne = res & (~res + 1);

        for (int arr : array) {
            if ((arr & rightOne) != 0) {
                num1[0] ^= arr;
            }
        }

        num2[0] = res ^ num1[0];
    }
}
