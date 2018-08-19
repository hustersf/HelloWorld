package 剑指offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Solution16 {

    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        List<Integer> list = new ArrayList<>();
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list.add(list1.val);
                list1 = list1.next;
            } else {
                list.add(list2.val);
                list2 = list2.next;
            }
        }

        //list1还有数据
        while (list1 != null) {
            list.add(list1.val);
            list1 = list1.next;
        }

        //list2还有数据
        while (list2 != null) {
            list.add(list2.val);
            list2 = list2.next;
        }

        ListNode head = new ListNode(list.get(0));
        ListNode temp = head;
        for (int i = 1; i < list.size(); i++) {
            ListNode node = new ListNode(list.get(i));
            temp.next = node;
            temp = node;
        }
        return head;

    }


    public static void main(String[] args) {

        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(5);
        ListNode a4 = new ListNode(7);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;

        ListNode b1 = new ListNode(2);
        ListNode b2 = new ListNode(4);
        ListNode b3 = new ListNode(6);
        b1.next = b2;
        b2.next = b3;


        Solution16 s16 = new Solution16();
        ListNode head = s16.Merge(a1, b1);

        while (head != null) {
            System.out.print(head.val + "\t");
            head = head.next;
        }
    }
}
