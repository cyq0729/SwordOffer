package offer.num56;

/**
 * Created by meitu on 2017/7/6.
 */
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead){

        if(pHead == null){
            return null;
        }
        if(pHead.next == pHead){
            return pHead;
        }
        ListNode meetingNode = getMeetingNode(pHead);
        if (meetingNode == null) {
            return null;
        }

        int nodesInLoop = 1;
        ListNode pNode1 = meetingNode;
        while (pNode1.next != meetingNode) {
            pNode1 = pNode1.next;
            nodesInLoop++;
        }

        pNode1 = pHead;
        for (int i = 0; i < nodesInLoop; i++) {
            pNode1 = pNode1.next;
        }

        ListNode pNode2 = pHead;
        while (pNode1 != pNode2) {
            pNode1 = pNode1.next;
            pNode2 = pNode2.next;
        }

        return pNode1;
    }

    public ListNode getMeetingNode(ListNode pHead){
        if (pHead == null) {
            return null;
        }

        ListNode slowNode = pHead.next;
        if (slowNode == null) {
            return null;
        }

        ListNode fastNode = slowNode.next;
        while (fastNode != null && fastNode != slowNode) {
            if (fastNode == slowNode) {
                return fastNode;
            }

            slowNode = slowNode.next;
            fastNode = fastNode.next;

            if (fastNode != null) {
                fastNode = fastNode.next;
            }
        }

        return fastNode;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}