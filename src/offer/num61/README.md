# 按之字形顺序打印二叉树

**题目**

请实现一个函数按照之字形打印二叉树，
即第一行按照从左到右的顺序打印，
第二层按照从右至左的顺序打印，
第三行按照从左到右的顺序打印，其他行以此类推。

**测试地址**
[按之字形顺序打印二叉树](https://www.nowcoder.com/practice/91b69814117f4e8097390d107d2efbe0?tpId=13&tqId=11212&rp=3&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

## 解题思路

树的层次遍历，只不过在每一层的有一个变量去记录是否是反向打印，然后对于反向打印将保存的ArrayList反向输出即可。

