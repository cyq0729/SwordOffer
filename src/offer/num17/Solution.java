package offer.num17;

/**
 * Created by byhieg on 2017/8/12.
 * Mail to byhieg@gmail.com
 */


public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        ListNode mergeHead = null;
        if (list1.val < list2.val) {
            mergeHead = list1;
            list1.next = Merge(list1.next, list2);
        }else{
            mergeHead = list2;
            list2.next = Merge(list1,list2.next);
        }

        return mergeHead;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
