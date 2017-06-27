# 翻转单词顺序列

**题目**

牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。
Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？

**测试地址**
[翻转单词顺序列](https://www.nowcoder.com/practice/3194a4f4cf814f63919d0790578d51f3?tpId=13&tqId=11197&rp=2&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking&tPage=3)

## 解题思路

时间复杂度o(N)
这道题用双翻转去做，先对整体的str进行一个翻转，然后对每一个空格隔开的字符串在进行一个翻转。
利用Java自带的api去做非常简单
第二个方法是通用的方法，通过前后指针交换顺序。

