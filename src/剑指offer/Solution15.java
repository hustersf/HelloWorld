package 剑指offer;

import java.util.Stack;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class Solution15 {

    public ListNode ReverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        if (stack.isEmpty()) {
            return null;
        }

        ListNode newHead = stack.pop();
        ListNode tmep = newHead;
        while (!stack.isEmpty()) {
            ListNode node = stack.pop();
            tmep.next = node;
            tmep = node;
        }
        tmep.next = null;
        return newHead;
    }

    public static void main(String[] args) {

        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);
        ListNode a6 = new ListNode(6);
        ListNode a7 = new ListNode(7);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        a6.next = a7;

        Solution15 s15 = new Solution15();
        ListNode head = s15.ReverseList(null);

        while (head != null) {
            System.out.print(head.val + "\t");
            head = head.next;
        }
    }
}
