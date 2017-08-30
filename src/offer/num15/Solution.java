package offer.num15;

/**
 * Created by byhieg on 2017/8/12.
 * Mail to byhieg@gmail.com
 */


public class Solution {

    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k <= 0) {
            return head;
        }

        ListNode firstNode = head;
        ListNode secondNode = head;
        for (int i = 1 ; i < k;i++) {
            secondNode = secondNode.next;
            if (secondNode == null) {
                return null;
            }
        }
        while (secondNode.next != null) {
            secondNode = secondNode.next;
            firstNode = firstNode.next;
        }

        return firstNode;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}
