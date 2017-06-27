package offer.num39_1;

/**
 * Created by byhieg on 2017/6/27.
 * Mail to byhieg@gmail.com
 */
public class Solution {

    public int TreeDepth(TreeNode root) {

        if(root == null){
            return 0;
        }

        int leftDepth = TreeDepth(root.left);
        int rightDepth = TreeDepth(root.right);

        return (leftDepth > rightDepth) ?(leftDepth + 1) : (rightDepth + 1);

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
