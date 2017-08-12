package offer.num24;

/**
 * Created by byhieg on 2017/8/12.
 * Mail to byhieg@gmail.com
 */
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return IsTreeBST (sequence,0,sequence.length - 1);
    }

    public boolean IsTreeBST (int[] sequence, int start,int end) {
        if(end <= start) return true;
        int root = sequence[end];
        int i = start;
        for (; i < end; i++) {
            if (sequence[i] > root) {
                break;
            }
        }
        int j = i;
        for (;j < end;j++ ) {
            if (sequence[j] < root) {
                return false;
            }
        }

        boolean left = true;

        if (i > start) {
            left = IsTreeBST (sequence, start, i - 1);
        }
        boolean right = true;
        if (i < end - 1) {
            right = IsTreeBST (sequence, i, end - 1);
        }

        return left && right;
    }
}

