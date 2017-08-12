# 合并两个排序的链表

**题目**

输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
**测试地址**

[合并两个排序的链表](https://www.nowcoder.com/practice/d8b6b4358f774294a89de2a6ac4d9337?tpId=13&tqId=11169&rp=3&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)


## 解题思路

比较两个链表的头节点，小的头节点作为新链表的头结点，与之前的合并的好的链表的尾部相连。

整个过程都可以用递归来实现。