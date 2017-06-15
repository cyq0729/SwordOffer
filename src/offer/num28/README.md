# 字符串的排列

**题目**

输入一个字符串,按字典序打印出该字符串中字符的所有排列。
例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。 

**测试地址**
[字符串的排列](https://www.nowcoder.com/practice/fe6b651b66ae47d7acce78ffdd9a96c7?tpId=13&tqId=11180&tPage=2&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

## 解题思路

这道题用递归做是非常方便的，可以分开一步一步来看。以cba为例
首先，让第一个字符与后面所有的字符交换，这样，字符串中所有的字符都会出现在第一个字符。会得到3个字符串cba,bca,abc;
然后，对于上述三个字符串，每一个的看成以第二个字符开始的一个新字符串，然后重复第一步，也就是对于每个字符串，让第二个字符与后面所有的字符交换。
最后，当交换到字符串结束时，就可以结束，放入结果集里面。

对于结果集，可以采用TreeSet进行字典序输出。

