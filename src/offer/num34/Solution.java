package offer.num34;

import offer.tools.FullPrint;

/**
 * Created by byhieg on 17/6/18.
 * Mail to byhieg@gmail.com
 */
public class Solution {
    public int GetUglyNumber_Solution1(int index) {
        if (index <= 0) {
            return 0;
        }
        int[] uglyNumbers = new int[index];
        uglyNumbers[0] = 1;
        int nextIndex = 1;

        int uN1 = 0;
        int uN2 = 0;
        int uN3 = 0;
        while (nextIndex < index) {
            int min = min(uglyNumbers[uN1] * 2, uglyNumbers[uN2] * 3, uglyNumbers[uN3] * 5);

            if (uglyNumbers[uN1] * 2 == min) {
                ++uN1;
            }
            if (uglyNumbers[uN2] * 3 == min) {
                ++uN2;
            }
            if (uglyNumbers[uN3] * 5 == min) {
                ++uN3;
            }
            uglyNumbers[nextIndex++] = min;
        }

        return uglyNumbers[index - 1];
    }

    public int min(int a, int b, int c) {
        int min = Math.min(a, b);
        return Math.min(min, c);
    }

    public int GetUglyNumber_Solution2(int index) {
        if (index <= 0) {
            return 0;
        }
        int number = 0;
        int uglyFound = 0;
        while (uglyFound < index) {
            ++number;
            if (isUglyNumber(number)) {
                uglyFound++;
            }
        }
        return number;
    }

    public boolean isUglyNumber(int number) {
        while (number % 2 == 0) {
            number = number / 2;
        }
        while (number % 3 == 0) {
            number = number / 3;
        }
        while (number % 5 == 0) {
            number = number / 5;
        }

        return number == 1;
    }

    public static void main(String[] args) {
        FullPrint.printResult(new Solution().GetUglyNumber_Solution1(1500));
    }
}
