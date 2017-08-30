package offer.num14;

/**
 * Created by byhieg on 2017/8/11.
 * Mail to byhieg@gmail.com
 */
public class Solution {

    public void reOrderArray(int [] array) {
        if (array == null || array.length == 0) {
            return;
        }

        for (int i = 1 ;i < array.length ; i ++ ) {
            for (int j = 0 ;j < array.length - 1;j++) {
                if (array[j] % 2 == 0 && array[j + 1] % 2 != 0) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }

    }
}
