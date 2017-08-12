# 链表中倒数第k个结点

**题目**

输入一个链表，输出该链表中倒数第k个结点。

**测试地址**

[链表中倒数第k个结点](https://www.nowcoder.com/practice/529d3ae5a407492994ad2a246518148a?tpId=13&tqId=11167&tPage=1&rp=3&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking)


## 解题思路

双指针，构造头指针与尾指针相距为k - 1的长度。当尾指针指向最后一个节点时，头指针刚好指向倒数第k个节点。