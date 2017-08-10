package offer.num6;

import apple.laf.JRSUIUtils;

/**
 * Created by byhieg on 2017/8/9.
 * Mail to byhieg@gmail.com
 */

public class Solution {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length == 0 || in.length == 0) {
            return null;
        }

        return reConstructBinaryTree(pre, 0, pre.length - 1,
                in, 0, in.length - 1);

    }

    public TreeNode reConstructBinaryTree(int[] pre, int startPreOrder, int endPreOrder,
                                          int[] in, int startInOrder, int endInOrder) {

        TreeNode root = new TreeNode(pre[startPreOrder]);
        if (startPreOrder >= endPreOrder || startInOrder >= endInOrder) {
            return root;
        }

        int rootOrder = startInOrder;
        while(rootOrder <= endInOrder && in[rootOrder] != pre[startPreOrder]){
            ++rootOrder;
        }

        int leftLength = rootOrder - startInOrder;
        int leftPreEnd = startPreOrder + leftLength;
        if (leftLength > 0) {
            root.left = reConstructBinaryTree(pre, startPreOrder + 1, leftPreEnd,
                    in, startInOrder, rootOrder - 1);
        }

        if (leftLength < endPreOrder - startPreOrder) {
            root.right = reConstructBinaryTree(pre, leftPreEnd + 1, endPreOrder,
                    in, rootOrder + 1, endInOrder);
        }

        return root;


    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
