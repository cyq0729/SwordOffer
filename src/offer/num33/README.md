# 把数组排成最小的数

**题目**
输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323

**测试地址**
[把数组排成最小的数](https://www.nowcoder.com/practice/8fecd3f8ba334add803bf2a06af1b993?tpId=13&tqId=11185&tPage=2&rp=2&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking)

## 解题思路

这道题的如果给出的数字位数都是一致的，即比如给出是{1，2，3},那么很容易得到最小的数字123，只需要将给出的数组按照从小打大排序即可。
那么这道题也是一样的，只不过我们需要人为指定一个排序的比较方式。
如果有n,m两个位数可能一样，也可能不一样的两个数。他们组合一起得到只能是nm或者mn，这两个结果的位数是一致的，那么我们可以得到这两个结果的大小。
如果nm > mn 那么我们就认为n比m大
如果nm < mn 那么我们就认为n比m小

因此，对于任意的两个数，我们都可以采用上面的判断方式进行排序。对于这道题，将数字转换成字符串。利用字符串的compareTo方法，可以有效避免组合的数字超过int范围。