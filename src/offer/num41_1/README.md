# 和为S的连续正数序列

**题目**

小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck! 

**输出描述**:
输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
**测试地址**
[和为S的连续正数序列](https://www.nowcoder.com/practice/c451a3fd84b64cb19485dad758a55ebe?tpId=13&tqId=11194&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)


## 解题思路

时间复杂度o(N)
因为是连续的整数列，我们可以一开始定义二个指针small = 1，big = 2。
如果small与big之间的数字和ContinuousSum < sum，则说明big小了，要向后移动，即big++;
如果small与big之间的数字和ContinuousSum > sum，则说明数字多了，需要剔除一些数字，先从small开始剔除，即small ++
如果small与big之间的数字和ContinuousSum = sum，则找到了一组，然后big++,small++,继续向后找。

