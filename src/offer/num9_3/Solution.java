package offer.num9_3;

/**
 * Created by byhieg on 2017/8/10.
 * Mail to byhieg@gmail.com
 */
public class Solution {
    public int RectCover(int target) {
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        int prev = 1;
        int next = 2;
        int res = 0;

        for (int i = 3; i <= target ; i++) {
            res = prev + next;
            prev = next;
            next = res;
        }

        return res;
    }
}
