# 包含min函数的栈

**题目**

定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。

**测试地址**
[包含min函数的栈](https://www.nowcoder.com/practice/4c776177d2c04c2494f2555c9fcc1e49?tpId=13&tqId=11173&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

## 解题思路

用两个栈,第一个栈是正常操作的栈，第二个栈是存放每次放入之后最小值的栈。

每次出栈，都会判断要出栈的值是不是最小值的栈的栈顶元素，是 就最小值也出栈，不是 最小值就不出栈