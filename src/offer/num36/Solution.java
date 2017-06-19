package offer.num36;

/**
 * Created by byhieg on 17/6/18.
 * Mail to byhieg@gmail.com
 */
public class Solution {

    public int InversePairs(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int length = array.length;
        int[] copyNums = new int[length];
        for (int i = 0; i < length; i++) {
            copyNums[i] = array[i];
        }
        int count = InversePairsCore(array, copyNums, 0, length - 1) % 1000000007;
        return count;

    }

    public int InversePairsCore(int[] array, int[] copyNums, int start, int end) {
        if (start == end) {
            copyNums[start] = array[start];
            return 0;
        }

        int mid = (end - start) / 2;
        int left = InversePairsCore(copyNums, array, start, start + mid) % 1000000007;
        int right = InversePairsCore(copyNums, array, start + mid + 1, end) % 1000000007;

        int i = start + mid;
        int j = end;
        int indexCopy = end;
        int count = 0;

        while (i >= start && j >= start + mid + 1) {
            if (array[i] > array[j]) {
                copyNums[indexCopy--] = array[i--];
                count += j - start - mid;
                if (count >= 1000000007) {
                    count %= 1000000007;
                }
            } else {
                copyNums[indexCopy--] = array[j--];
            }
        }

        for (; i >= start; --i) {
            copyNums[indexCopy--] = array[i];
        }

        for (; j >= start + mid + 1; --j) {
            copyNums[indexCopy--] = array[j];
        }

        return left + right + count;
    }
}
