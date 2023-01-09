package leetcode_75_days.day_3;

import leetcode_75_days.ListNode;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        if (head == null) return null;

        ListNode prev = null;
        ListNode current = head;

        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

}
