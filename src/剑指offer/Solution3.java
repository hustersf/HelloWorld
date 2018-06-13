package 剑指offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 从尾到头打印链表
 * 利用栈的
 */
public class Solution3 {


    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<ListNode> stack = new Stack<>();

        while (listNode != null) {
            stack.add(listNode);
            listNode = listNode.next;
        }

        ArrayList<Integer> list=new ArrayList<>();
        while(!stack.isEmpty()){
            list.add(stack.pop().val);
        }

        return list;

    }

    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;

        Solution3 s3 = new Solution3();
        for (Integer i : s3.printListFromTailToHead(a)) {
            System.out.print(i + "\t");
        }

    }
}
