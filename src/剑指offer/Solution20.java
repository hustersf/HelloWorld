package 剑指offer;

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））
 */
public class Solution20 {

    private Stack<Integer> stack = new Stack<>();
    private int minNode = Integer.MAX_VALUE;

    public void push(int node) {
        stack.push(node);
        if (node < minNode) {
            minNode = node;
        }
    }

    public void pop() {
        int num = stack.pop();

        //如果出栈的正好是最小的数，则需要找到新的最小的数
        if (num == minNode) {
            int temp = stack.get(0);
            for (int i = 1; i < stack.size(); i++) {
                if (temp > stack.get(i)) {
                    temp = stack.get(i);
                }
            }
            minNode = temp;
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minNode;
    }

    public static void main(String[] args) {

        Solution20 s20=new Solution20();

        s20.push(3);
        s20.push(6);
        s20.push(1);
        s20.push(8);
        s20.push(-1);

        s20.pop();

        System.out.println(s20.min());

    }
}
