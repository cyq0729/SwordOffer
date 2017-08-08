package offer.num5;

/**
 * Created by byhieg on 2017/8/8.
 * Mail to byhieg@gmail.com
 */

import java.util.ArrayList;

public class Solution {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (listNode != null){
            if (listNode.next != null) {
                arrayList.addAll(printListFromTailToHead(listNode.next));
            }
            arrayList.add(listNode.val);
        }
        return arrayList;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}