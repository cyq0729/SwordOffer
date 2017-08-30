package offer.num21;

import java.util.Stack;

/**
 * Created by byhieg on 2017/8/12.
 * Mail to byhieg@gmail.com
 */

public class Solution {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public void push(int node) {
        stack.push(node);
        if (min.isEmpty()) {
            min.push(node);
        }else{
            if (node < min.peek()) {
                min.push(node);
            }
        }
    }

    public void pop() {
        int value = stack.pop();
        if (value == min.peek()) {
            min.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min.peek();
    }
}