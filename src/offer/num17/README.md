# 树的子结构

**题目**

输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）

**测试地址**

[树的子结构](https://www.nowcoder.com/practice/6e196c44c7004d15b1610b9afca8bd88?tpId=13&tqId=11170&rp=3&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking&tPage=1)


## 解题思路

该算法分成2步骤：

1. 遍历root1的每个节点 找到与root2相同的值的节点（先序遍历）
2. 找到这个节点之后，在比较这个节点之后的每个节点是否与root2节点的值相同，还是先序遍历。直到root2为null