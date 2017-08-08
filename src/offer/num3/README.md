# 二维数组中的查找

**题目**

在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

**测试地址**
[二维数组中的查找](https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e?tpId=13&tqId=11154&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

## 解题思路

利用给的两个递增数组，可以在左下角的地方做判断，如果左下角的值比target小，则说明要向右边去查找。如果左下角的值比target大，则说明要向上边去查找。

时间复杂度是lgN * lgN
