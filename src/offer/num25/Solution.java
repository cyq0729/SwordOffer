package offer.num25;

import java.util.ArrayList;

/**
 * Created by byhieg on 2017/8/12.
 * Mail to byhieg@gmail.com
 */
public class Solution {

    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    ArrayList<Integer> lists = new ArrayList<>();


    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root == null){
            return res;
        }
        lists.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            res.add(new ArrayList<>(lists));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        lists.remove(lists.size() - 1);
        return res;
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
