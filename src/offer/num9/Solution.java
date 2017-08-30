package offer.num9;

/**
 * Created by byhieg on 2017/8/10.
 * Mail to byhieg@gmail.com
 */
public class Solution {
    public int Fibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }

        int prev = 1;
        int next = 1;
        int res = 0;
        for (int i = 3; i <=n ; i++) {
            res = prev + next;
            prev = next;
            next = res;
        }

        return res;

    }
}