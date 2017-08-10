package offer.num8;

/**
 * Created by byhieg on 2017/8/10.
 * Mail to byhieg@gmail.com
 */
public class Solution {

    public int minNumberInRotateArray(int [] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int firstIndex = 0;
        int lastIndex = array.length - 1;
        int mid = (firstIndex + lastIndex) / 2;
        while (firstIndex != lastIndex - 1){
            if (array[mid] >= array[firstIndex]) {
                firstIndex = mid;
            }else{
                lastIndex = mid;
            }
            mid = (firstIndex + lastIndex) / 2;
        }
        return array[lastIndex];
    }
}
