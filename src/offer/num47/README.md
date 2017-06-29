## 不用加减乘除做加法

**题目**

写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。

**测试地址**
[不用加减乘除做加法](https://www.nowcoder.com/practice/59ac416b4b944300b617d4f7f111b215?tpId=13&tqId=11201&rp=3&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking)


## 解题思路

利用二进制进行做加法，先不考虑进位进行相加得到sum，然后在仅仅考虑需要进位的结果carry
让sum + carry,在这步的时候也需要考虑进位。

