package offer.num57;


public class Solution {


    public ListNode deleteDuplication(ListNode pHead) {

        ListNode first = new ListNode(-1);
        first.next = pHead;
        ListNode p = pHead;
        ListNode last = first;
        while (p != null && p.next != null) {
            if (p.val == p.next.val) {
                p = p.next;
                last.next = p;
            } else {
                last = p;
                p = p.next;
            }
        }
        return first.next;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
