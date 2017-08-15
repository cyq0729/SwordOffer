package offer.num59;

import java.util.ArrayList;

/**
 * Created by meitu on 2017/7/6.
 */
public class Solution {

    boolean isSymmetrical(TreeNode pRoot){
        if(pRoot == null){
            return true;
        }

        return isCommon(pRoot.left,pRoot.right);
    }

    boolean isCommon(TreeNode left,TreeNode right){

        if(left == null) return right == null;
        if(right == null) return left == null;
        if(left.val != right.val)return false;

        return isCommon(left.left,right.right) && isCommon(left.right,right.left);
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
