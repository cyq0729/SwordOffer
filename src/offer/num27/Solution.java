package offer.num27;

/**
 * Created by shiqifeng on 2017/6/14.
 * Mail byhieg@gmail.com
 */
public class Solution {


    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        if (pRootOfTree.left == null && pRootOfTree.right == null) {
            return pRootOfTree;
        }

        TreeNode left = Convert(pRootOfTree.left);
        TreeNode p = left;
        while (p != null && p.right != null) {
            p = p.right;
        }
        if (p != null) {
            p.right = pRootOfTree;
            pRootOfTree.left = p;
        }
        TreeNode right = Convert(pRootOfTree.right);
        if (right != null) {
            right.left = pRootOfTree;
            pRootOfTree.right = right;
        }

        return left != null ? left : pRootOfTree;
    }

    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode l1 = new TreeNode(6);
        TreeNode r1 = new TreeNode(14);
        TreeNode l2 = new TreeNode(4);
        TreeNode l3 = new TreeNode(8);
        TreeNode r2 = new TreeNode(12);
        TreeNode r3 = new TreeNode(16);

        root.left = l1;
        root.right = r1;

        l1.left = l2;
        l1.right = l3;

        r1.left = r2;
        r1.right = r3;

        root = new Solution().Convert(root);
        System.out.println(root.val);
    }
}
