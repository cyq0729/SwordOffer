# 序列化二叉树

**题目**

请实现两个函数，分别用来序列化和反序列化二叉树

**测试地址**
[序列化二叉树](https://www.nowcoder.com/practice/cf7e25aa97c04cc1a68c8f040e71fb84?tpId=13&tqId=11214&rp=3&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking&tPage=4)

## 解题思路

常规的遍历方法无法恢复二叉树的原因是不会记录空节点并且碰到两个节点值相同的情况，恢复的情况不唯一。

所以，在遍历的时候要把树的全部情况都记录下来，如果树的子节点为空，就设定一个特殊的符号。
这样按照前序遍历树，保存的节点就是有值的节点和空值节点。