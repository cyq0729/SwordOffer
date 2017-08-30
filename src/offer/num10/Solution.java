package offer.num10;

/**
 * Created by byhieg on 2017/8/10.
 * Mail to byhieg@gmail.com
 */
public class Solution {

    public int NumberOf1(int n) {
        int count = 0;
        while(n != 0){
            if ((n & 1) == 1) {
                count++;
            }
            n = n >>>1;
        }

        return count;
    }

    public int NumberOf2(int n) {
        int count = 0;
        while(n != 0){
            n = (n - 1)&n;
            count++;
        }

        return count;

    }
}
