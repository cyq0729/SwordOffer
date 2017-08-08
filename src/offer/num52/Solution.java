package offer.num52;

/**
 * Created by meitu on 2017/7/4.
 */
public class Solution {

    public int[] multiply(int[] A) {
        int length = A.length;
        if (A == null || length == 0) {
            return new int[]{};
        }
        int[] B = new int[length];
        if (length != 0) {
            B[0] = 1;
            for (int i = 1; i < length ; i++) {
                B[i] = B[i - 1] * A[i - 1];
            }

            int temp = 1;
            for (int i = length - 2; i >=0; i--) {
                temp *= A[i + 1];
                B[i] *= temp;
            }
        }

        return B;
    }
}
