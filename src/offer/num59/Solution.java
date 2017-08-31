package offer.num59;

import java.util.ArrayList;

/**
 * Created by meitu on 2017/7/6.
 */
public class Solution {

    boolean isSymmetrical(TreeNode pRoot) {
        return pRoot == null || isCommon(pRoot.left, pRoot.right);

    }
    private boolean isCommon(TreeNode left, TreeNode right) {

        if (left == null) return right == null;
        return right != null && left.val == right.val && isCommon(left.left, right.right) && isCommon(left.right, right.left);

    }


    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
}
