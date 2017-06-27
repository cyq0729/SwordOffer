package offer.num39_2;

/**
 * Created by byhieg on 2017/6/27.
 * Mail to byhieg@gmail.com
 */
public class Solution {

    /**
     * 从上到下依次判断，
     *
     * @param root
     * @return
     */
    public boolean IsBalanced_Solution1(TreeNode root) {

        if (root == null) {
            return true;
        }

        int left = getTreeDepth1(root.left);
        int right = getTreeDepth1(root.right);

        int diff = left - right;
        if (diff > 1 || diff < -1) {
            return false;
        }

        return IsBalanced_Solution1(root.left) && IsBalanced_Solution1(root.right);
    }

    public int getTreeDepth1(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = getTreeDepth1(root.left);
        int right = getTreeDepth1(root.right);

        return (left > right) ? (left + 1) : (right + 1);
    }

    private boolean isBalanced = true;

    public boolean IsBalanced_Solution2(TreeNode root) {
        getDepth2(root);
        return isBalanced;
    }

    public int getDepth2(TreeNode root) {
        if (root == null)
            return 0;
        int left = getDepth2(root.left);
        int right = getDepth2(root.right);

        if (Math.abs(left - right) > 1) {
            isBalanced = false;
        }
        return right > left ? right + 1 : left + 1;

    }

    public boolean IsBalanced_Solution3(TreeNode root){
        return IsBalanced_Solution3(root,new Wrapper());
    }

    public boolean IsBalanced_Solution3(TreeNode root,Wrapper w){
        if (root == null) {
            return true;
        }

        Wrapper left = new Wrapper();
        Wrapper right = new Wrapper();

        if (IsBalanced_Solution3(root.left, left) && IsBalanced_Solution3(root.right, right)) {
            if (Math.abs(left.depth - right.depth) > 1) {
                return false;
            }

            w.depth = 1 + left.depth > right.depth ? left.depth : right.depth;
            return true;
        }

        return false;
    }

    private class Wrapper{
        int depth;
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
