package 剑指offer;

import java.util.Stack;

/**
 *  用两个栈来实现一个队列
 *  栈   先进后出
 *  队列 先进先出
 */
public class Solution5 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        int result=stack2.pop();

        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return result;
    }


    public static void main(String[] args){

        Solution5  s5=new Solution5();
        s5.push(1);
        s5.push(2);
        s5.push(3);

        System.out.println(s5.pop());
        s5.push(4);
        System.out.println(s5.pop());

    }
}
