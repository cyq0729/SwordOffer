package offer.num3;

/**
 * Created by byhieg on 2017/8/8.
 * Mail to byhieg@gmail.com
 */

public class Solution {
    public boolean Find(int target, int[][] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        int n = array.length;
        int m = array[0].length;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] == target) {
                    return true;
                }else if (array[i][j] > target) {
                    break;
                }


            }
        }
        return false;
    }
}