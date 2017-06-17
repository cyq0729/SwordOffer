package offer.num29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by byhieg on 17/6/17.
 * Mail to byhieg@gmail.com
 */
public class Solution {

    public int MoreThanHalfNum_Solution1(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int length = array.length;
        int middle = length / 2;
        int start = 0;
        int end = length - 1;
        int index = partition(array, start, end);
        while (index != middle) {
            if (index > middle) {
                end = index - 1;
                index = partition(array, start, end);
            } else {
                start = index + 1;
                index = partition(array, start, end);
            }
        }
        int res = array[middle];
        if (checkMoreThanHalf(array, length, res)) {
            return res;
        } else {
            return 0;
        }
    }

    public int partition(int[] numbers, int start, int end) {
        int i = start;
        int j = end;
        int x = numbers[i];
        while (i < j) {
            while (i < j && numbers[j] >= x) j--;
            if (i < j) {
                numbers[i] = numbers[j];
                i++;
            }

            while (i < j && numbers[i] <= x) i++;
            if (i < j) {
                numbers[j] = numbers[i];
                j--;
            }
        }

        numbers[i] = x;
        return i;
    }

    public boolean checkMoreThanHalf(int[] array, int length, int result) {
        int times = 0;
        for (int anArray : array) {
            if (anArray == result) {
                times++;
            }
        }
        return times * 2 > length;
    }

    public int MoreThanHalfNum_Solution2(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int res = array[0];
        int times = 1;
        for (int i = 1; i < array.length; i++) {
            if (times == 0) {
                res = array[i];
                times = 1;
            } else if (array[i] == res) {
                times++;
            }else{
                times--;
            }
        }

        if (checkMoreThanHalf(array, array.length, res)) {
            return res;
        }else{
            return 0;
        }
    }


    public int MoreThanHalfNum_Solution3(int [] array) {
        Map<Integer,Integer> maps = new HashMap<>();
        for(int i = 0 ; i < array.length;i++){
            int value = array[i];
            if(maps.containsKey(value)){
                int count = maps.get(value);
                maps.put(value,++count);
            }else{
                maps.put(value,1);

            }
        }

        Set<Integer> keys = maps.keySet();
        Iterator it = keys.iterator();
        while(it.hasNext()){
            Integer value = (Integer)it.next();
            int count = maps.get(value);
            if(count > array.length / 2){
                return value;
            }
        }
        return 0;

    }
    public static void main(String[] args) {
        int[] nums = new int[]{
                1,2,3,2,4,2,5,2,3
        };
        System.out.println(new Solution().MoreThanHalfNum_Solution1(nums));
        System.out.println(new Solution().MoreThanHalfNum_Solution2(nums));
    }
}
