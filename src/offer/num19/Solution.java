package offer.num19;

/**
 * Created by byhieg on 2017/8/12.
 * Mail to byhieg@gmail.com
 */
public class Solution {
    public void Mirror(TreeNode root) {
        if (root != null) {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            Mirror(root.left);
            Mirror(root.right);
        }

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
