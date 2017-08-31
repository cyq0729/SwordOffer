package offer.num58;

/**
 * Created by meitu on 2017/7/6.
 */
public class Solution {

    public TreeLinkNode GetNext(TreeLinkNode pNode){
        if (pNode == null) {
            return null;
        }
        TreeLinkNode next = null;

        if (pNode.right != null) {
            TreeLinkNode right = pNode.right;
            while(right.left != null){
                right = right.left;
            }
            next = right;
        }else if(pNode.next != null){
            TreeLinkNode current = pNode;
            TreeLinkNode parent = pNode.next;
            while (parent != null && current == parent.right) {
                current = parent;
                parent = parent.next;

            }

            next = parent;
        }

        return next;
    }

    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
}
