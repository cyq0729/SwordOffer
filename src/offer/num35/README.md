# 第一个只出现一次的字符

**题目**
在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置

**测试地址**
[第一个只出现一次的字符](https://www.nowcoder.com/practice/1c82e8cf713b4bbeb2a5b31cf5b0417c?tpId=13&tqId=11187&tPage=2&rp=2&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking)

## 解题思路

哈希表存放每个字符的出现次数，这里因为只需要次数为1的字符，因此对于次数不是1的，统一设置为了2。
时间复杂度是o(N)，空间复杂度也是o(N)