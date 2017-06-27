# 二叉树的深度

**题目**

输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。

**测试地址**
[二叉树的深度](https://www.nowcoder.com/practice/435fb86331474282a3499955f0a41e8b?tpId=13&tqId=11191&tPage=2&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

## 解题思路

以下面这棵树为例：

![二叉树](http://image.baidu.com/search/detail?ct=503316480&z=undefined&tn=baiduimagedetail&ipn=d&word=%E4%BA%8C%E5%8F%89%E6%A0%91&step_word=&ie=utf-8&in=&cl=2&lm=-1&st=undefined&cs=1981060663,79067104&os=7069608,933637138&simid=0,0&pn=1&rn=1&di=131204357020&ln=1933&fr=&fmq=1498531787473_R&fm=&ic=undefined&s=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&is=0,0&istype=0&ist=&jit=&bdtype=0&spn=0&pi=0&gsm=0&objurl=http%3A%2F%2Fs15.sinaimg.cn%2Fmw690%2F002Ip0v1ty6ISuyrVZsce%26690&rpstart=0&rpnum=0&adpicid=0)

我们可以采用递归的思路去处理这个问题，以1为根节点，那么其深度应该是以2为根节点的左子树深度与以3为根节点的右子树深度的最大值 + 1。
那么对于2为根节点的左子树深度和以3为根节点的右子树深度，又可以按照上面的思路(找到左右子树的深度的最大值 + 1)。

