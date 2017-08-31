package offer.num37;

/**
 * Created by byhieg on 17/6/20.
 * Mail to byhieg@gmail.com
 */
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null){
            return null;
        }
        int length1 = 0;
        int length2 = 0;
        ListNode cur1 = pHead1;
        ListNode cur2 = pHead2;
        while(cur1 != null){
            cur1 = cur1.next;
            length1++;
        }

        while(cur2 != null){
            cur2 = cur2.next;
            length2++;
        }

        int diff = length1 - length2;
        ListNode longNode = pHead1;
        ListNode shortNode = pHead2;

        if(length2 > length1){
            longNode = pHead2;
            shortNode = pHead1;
            diff = length2 - length1;
        }

        for (int i = 0 ; i < diff;i++) {
            longNode = longNode.next;
        }

        while (longNode != null) {
            if (longNode == shortNode) {
                return shortNode;
            }else{
                longNode = longNode.next;
                shortNode = shortNode.next;
            }
        }
        return null;

    }


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
