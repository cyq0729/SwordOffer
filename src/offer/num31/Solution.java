package offer.num31;

/**
 * Created by byhieg on 17/6/17.
 * Mail to byhieg@gmail.com
 */
public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length == 0 || array == null){
            return 0;
        }
        int currentSum = 0;
        int biggestSum = Integer.MIN_VALUE;
        for(int i = 0 ; i < array.length;i++){
            if(currentSum <= 0){
                currentSum = array[i];
            }else{
                currentSum += array[i];
            }

            if(currentSum > biggestSum){
                biggestSum = currentSum;
            }
        }
        return biggestSum;

    }
}
