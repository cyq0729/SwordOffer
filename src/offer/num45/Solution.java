package offer.num45;

/**
 * Created by byhieg on 2017/6/29.
 * Mail to byhieg@gmail.com
 */
public class Solution {

    public int LastRemaining_Solution(int n, int m) {

        if (n < 1 && m < 1) {
            return -1;
        }

        int last = 0;
        for (int i = 2; i <= n; i++) {
            last = (last + m) % i;
        }

        return last;
    }
}
