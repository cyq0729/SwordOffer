# 二叉搜索树的后序遍历序列

**题目**

输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。

**测试地址**
[二叉搜索树的后序遍历序列](https://www.nowcoder.com/practice/a861533d45854474ac791d90e447bafd?tpId=13&tqId=11176&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)


## 解题思路

BST的后续遍历 先找到根节点，然后在数组前面 找到大于根节点的值，那个是右子树。前面的就是左子树。

如果右子树的所有值不全大于根节点，则一定不是。

然后递归左子树和右子树。