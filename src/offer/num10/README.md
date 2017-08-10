# 二进制中1的个数

**题目**

输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。

**测试地址**
[二进制中1的个数](https://www.nowcoder.com/practice/8ee967e43c2c4ec193b040ea7fbb10b8?tpId=13&tqId=11164&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking&tPage=1)


## 解题思路

最简单的方式，时间复杂度是o(N)，不断右移，判断最后一位是不是1，但是要无符号右移。

因为有符号右移 负数的时候，最高位要补1，无法结束循环

另一种方式： 直接计算 `n = (n - 1)&n;`的循环次数。

因为n - 1 & n 如果最后1位是1，则消失一个1，如果不是，则正常。
所以，n中有多少个1，就会循环多少次。
                 
