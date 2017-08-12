# 二叉树的镜像

**题目**

操作给定的二叉树，将其变换为源二叉树的镜像。

**测试地址**

[二叉树的镜像](https://www.nowcoder.com/practice/564f4c26aa584921bc75623e48ca3011?tpId=13&tqId=11171&rp=3&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking&tPage=1)


## 解题思路

还是两个步骤：

先序遍历每一个节点，如果节点不为null，则交换节点的左右子树。