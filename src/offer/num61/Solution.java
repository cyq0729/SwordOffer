package offer.num61;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by meitu on 2017/7/6.
 */
public class Solution {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        if(pRoot == null){
            return new ArrayList<>();
        }
        ArrayList<ArrayList<Integer>> array = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        LinkedList<TreeNode> list = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        boolean isOdd = true;
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
                if(isOdd){
                    array.add(res);
                }else{
                    array.add(getReverse(res));
                }
                isOdd = !isOdd;

                for(int i = 0 ; i < list.size();i++){
                    queue.offer(list.get(i));
                }
                res = new ArrayList<>();
                list = new LinkedList<>();
            }
        }
        return array;

    }

    public ArrayList<Integer> getReverse(ArrayList<Integer> list){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = list.size() - 1;i >= 0;i--){
            res.add(list.get(i));
        }

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