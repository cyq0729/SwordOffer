## 链表中环的入口结点

**题目**

一个链表中包含环，请找出该链表的环的入口结点。
 
**测试地址**
[链表中环的入口结点](https://www.nowcoder.com/practice/253d2c59ec3e4bc68da16833f79a38e4?tpId=13&tqId=11208&tPage=3&rp=3&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

## 解题思路

这道题可以分成2步：

1. 找到环中有几个节点，记为m。
2. 让A指针先走m个节点，然后AB再一起走，直到两个指针相遇。相遇的节点是入口节点。

找到环中几个节点， 同样采用一快一慢两个指针，记录首次相遇的节点。然后继续走，直到再走到这个节点，记录走过的个数。

