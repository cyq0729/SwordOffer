package offer.num16;

/**
 * Created by byhieg on 2017/8/12.
 * Mail to byhieg@gmail.com
 */
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode reverseHead = null;
        ListNode node = head;
        ListNode prev = null;
        while(node != null){
            ListNode next = node.next;
            if(next == null){
                reverseHead = node;
            }
            node.next = prev;
            prev = node;
            node = next;
        }
        return reverseHead;
//        if(head.next == null){
//            return head;
//        }
//		ListNode node = ReverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return node;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
