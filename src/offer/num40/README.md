# 数组中只出现一次的数字

**题目**

一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。

**测试地址**
[数组中只出现一次的数字](https://www.nowcoder.com/practice/e02fdb54d7524710a7d664d082bb7811?tpId=13&tqId=11193&rp=2&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking&tPage=2)

解题思路：

时间复杂度o(N)

遍历一遍数组，对数组的每个数都用^ ,记录最后的结果为res。
所求的两个数为num1[0],num2[0].那么`res = num1[0] ^ num2[0]`

我们需要将该数组分成2部分，一部分是只有num1,另一部分是只有num2.这样，对每个部分进行^就求出了num1，与num2.
我们区分的依据是res从右向左数的第一个1出现的位置K,如果num1的第k位为1，那么num2的第K位就不会为1，否则res就为0
通过用 res & (-res + 1)的方式可以得到从右向左数的第一个1出现的位置K
然后判断数组中每一个数，是否第K位为1，如果为1就num1 ^ 该数，这样遍历之后，就得到num1
num2 = res ^ num1
