package offer.num61;
import java.util.*;
/**
 * Created by meitu on 2017/7/7.
 */


public class Solution {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        if(pRoot == null){
            return new ArrayList<>();
        }
        ArrayList<ArrayList<Integer>> array = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        LinkedList<TreeNode> list = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            res.add(node.val);
            if(node.left != null){
                list.add(node.left);
            }
            if(node.right != null){
                list.add(node.right);
            }
            if(queue.isEmpty()){
                array.add(res);
                for(int i = 0 ; i < list.size();i++){
                    queue.offer(list.get(i));
                }
                res = new ArrayList<>();
                list = new LinkedList<>();
            }
        }
        return array;
    }

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
}