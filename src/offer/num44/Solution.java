package offer.num44;

import java.util.Arrays;

/**
 * Created by byhieg on 2017/6/27.
 * Mail to byhieg@gmail.com
 */
public class Solution {

    public boolean isContinuous(int [] numbers) {
        if (numbers == null || numbers.length == 0) {
            return false;
        }
        Arrays.sort(numbers);

        boolean res = true;
        int countZero = 0;
        int countDiff = 0;
        for(int i = 0 ; i < numbers.length - 1;i++){
            if(numbers[i] == 0){
                countZero++;
                continue;
            }
            if(Math.abs(numbers[i + 1] - numbers[i]) == 0){
                return false;
            }else if (Math.abs(numbers[i + 1] - numbers[i] - 1) >= 1) {
                countDiff += Math.abs(numbers[i + 1] - numbers[i] - 1);
                res = false;
            }
        }

        if (countZero == countDiff) {
            res = true;
        }

        return res;
    }

}
