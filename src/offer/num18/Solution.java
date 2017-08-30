package offer.num18;

/**
 * Created by byhieg on 2017/8/12.
 * Mail to byhieg@gmail.com
 */
public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean res = false;
        if (root1 != null && root2 != null) {
            if (root1.val == root2.val) {
                res = judgeHasSubTree(root1, root2);
            }
            if (!res) {
                res = HasSubtree(root1.left, root2);
            }
            if (!res) {
                res = HasSubtree(root1.right, root2);
            }
        }

        return res;
    }

    private boolean judgeHasSubTree(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }

        if (root1.val != root2.val) {
            return false;
        }
        return judgeHasSubTree(root1.left, root2.left) && judgeHasSubTree(root1.right, root2.right);

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
