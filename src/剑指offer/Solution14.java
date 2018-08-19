package 剑指offer;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * <p>
 * 遍历链表，计算出链表的长度l
 * 倒数第k个节点，就是第 l-k+1 个节点
 */
public class Solution14 {

    public ListNode FindKthToTail(ListNode head, int k) {

        int l = 0;
        ListNode temp = head;
        while (temp != null) {
            l++;
            temp = temp.next;
        }

        int index = 0;
        while (head != null) {
            index++;
            if (index == l - k + 1) {
                return head;
            }
            head = head.next;
        }

        return null;
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

        Solution14 s14 = new Solution14();
        ListNode k = s14.FindKthToTail(a1, 7);

        System.out.println(k.val);

    }
}
