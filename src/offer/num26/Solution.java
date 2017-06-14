package offer.num26;

import java.util.HashMap;

/**
 * Created by shiqifeng on 2017/6/14.
 * Mail byhieg@gmail.com
 */
public class Solution {

    class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead){

        if(pHead == null){
            return null;
        }

        HashMap<RandomListNode,RandomListNode> map = new HashMap<>();

        RandomListNode rHead = new RandomListNode(pHead.label);

        map.put(pHead,rHead);
        RandomListNode rCur = rHead;
        RandomListNode cur = pHead.next;

        while(cur != null){
            rCur.next = new RandomListNode(cur.label);
            map.put(cur,rCur.next);
            cur = cur.next;
            rCur = rCur.next;
        }

        rHead.random = map.get(pHead.random);
        rCur = rHead.next;
        cur = pHead.next;

        while(cur != null){
            rCur.random = map.get(cur.random);
            rCur = rCur.next;
            cur = cur.next;
        }

        return rHead;

    }
}
