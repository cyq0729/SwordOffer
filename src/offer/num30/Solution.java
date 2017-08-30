package offer.num30;

import offer.tools.FullPrint;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by byhieg on 17/6/17.
 * Mail to byhieg@gmail.com
 */
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution1(int[] input, int k) {
        if (input == null || input.length == 0 || k <= 0 || k > input.length) {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> res = new ArrayList<>();

        int start = 0;
        int end = input.length - 1;
        int index = partition(input, start, end);
        while (index != k - 1) {
            if (index > k - 1) {
                end = index - 1;
                index = partition(input, start, end);
            } else {
                start = index + 1;
                index = partition(input, start, end);
            }

        }

        for (int i = 0; i <= index; i++) {
            res.add(input[i]);
        }
        return res;
    }

    public int partition(int[] input, int start, int end) {
        int i = start;
        int j = end;
        int x = input[i];
        while (i < j) {
            while (i < j && input[j] >= x) j--;
            if (i < j) {
                input[i] = input[j];
                i++;
            }

            while (i < j && input[i] <= x) i++;
            if (i < j) {
                input[j] = input[i];
                j--;
            }
        }

        input[i] = x;
        return i;
    }


    public ArrayList<Integer> GetLeastNumbers_Solution2(int[] input, int k) {
        if (input == null || input.length == 0 || k <= 0 || k > input.length) {
            return new ArrayList<>();
        }
        ArrayList<Integer> res = new ArrayList<>();
        int[] heap = new int[k];
        for (int i = 0; i < k; i++) {
            heap[i] = input[i];
        }
        for (int i = k / 2; i >= 0; i--) {
            sink(heap, i, k);
        }
        for (int i = k; i < input.length; i++) {
            if (input[i] < heap[0]) {
                heap[0] = input[i];
                sink(heap, 0, k);
            }
        }

        for (int i = 0; i < k; i++) {
            res.add(heap[i]);
        }
        return res;
    }

    public void sink(int[] nums, int i, int n) {
        int son = 2 * i + 1;
        while (son <= n - 1) {
            if (son < n - 1 && nums[son] < nums[son + 1]) son++;
            if (nums[i] < nums[son]) {
                int tmp = nums[i];
                nums[i] = nums[son];
                nums[son] = tmp;
                i = son;
                son = 2 * i + 1;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] num = new int[]{
                4, 5, 1, 6, 2, 7, 2, 8
        };
        ArrayList<Integer> list = new Solution().GetLeastNumbers_Solution2(num, 4);
        FullPrint.printList(list);
    }
}
