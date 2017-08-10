# 用两个栈实现队列

**题目**

用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。

**测试地址**
[用两个栈实现队列](https://www.nowcoder.com/practice/54275ddae22f475981afa2244dd448c6?tpId=13&tqId=11158&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

## 解题思路

这道题，关键在于一个栈 无法实现尾部入队，头部出队。如果用两个栈，当放入的时候，还是向第一个栈中放入，但出队的时候，将第一个栈中的元素,
全部放入第二个栈中，然后出栈第二个栈即可。
