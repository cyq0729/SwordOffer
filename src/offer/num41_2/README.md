# 和为S的两个数字

**题目**

输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。 

**输出描述**:
对应每个测试案例，输出两个数，小的先输出。
**测试地址**
[和为S的两个数字](https://www.nowcoder.com/practice/390da4f7a00f44bea7c2f3d19491311b?tpId=13&tqId=11195&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

## 解题思路
时间复杂度是o(N)
同第一题，也是设立两个指针，一个small指针，一个big指针 small = 0，表示数组第一个元素，big = arr.length - 1,表示数组最后一个元素
计算其和s,如果s < sum 则small ++
如果s > sum 则big --;
相等则就是一对，至于满足题目的输出，就还需要保存之前乘积最小的那个，如果新找到的乘积更小，则替换。