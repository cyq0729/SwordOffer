# 顺时针打印矩阵

**题目**

输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.

**测试地址**
[顺时针打印矩阵](https://www.nowcoder.com/practice/9b4c81a02cd34f76be2659fa0d54342a?tpId=13&tqId=11172&rp=3&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking&tPage=1)


## 解题思路

这道题的思路很简单就是一圈一圈的打印数字，涉及到的关键点是有两个。

1. 如何判断打印完成
2. 每一圈上个边的范围怎么判断

设定一个起始的start值。
针对第一个：当行数 <= start * 2 或者列数 <= start * 2时，就结束了。
每打印一圈 start + 1

endX = 列数 - start - 1
endY = 行数 - start - 1
针对第二个 最上面范围是 行数为start 列数的范围 start 到endX
右边 不一定有 存在的条件是start < endY  行数范围 start + 1到 endY  列数endX

下边 不一定有 存在的条件是start < endX && start < endY 行数为endY 列数的范围 endX - 1 到start

左边 不一定有 存在的条件是start < endX && start < endY - 1 行数范围 endY - 1到 start + 1  列数start
