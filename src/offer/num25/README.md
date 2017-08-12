# 二叉树中和为某一值的路径

**题目**

输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。


**测试地址**
[二叉树中和为某一值的路径](https://www.nowcoder.com/practice/b736e784e3e34731af99065031301bca?tpId=13&tqId=11177&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)


## 解题思路

遍历的方式采用先序遍历，当查找到叶子节点时，如果target不为0,就回退。
利用的方式 就是递归，在结束前 删除最近添加的节点。