package leetcode_75_days.day_4;

import leetcode_75_days.ListNode;

import java.util.HashSet;

public class LinkedListCycle2 {

    // Time Complexity : O(n)
    // Space Complexity : O(n)
    public ListNode detectCycle(ListNode head) {

        HashSet<ListNode> uniqueNodes = new HashSet<>();
        boolean isAllUniqueNodes = true;

        while (head != null && isAllUniqueNodes) {
            isAllUniqueNodes = uniqueNodes.add(head); // true if there is no cycle
            if (isAllUniqueNodes) {
                head = head.next;
            }
        }

        return head;
    }

    public ListNode detectCycleFast(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        while (head != slow) {
            head = head.next;
            slow = slow.next;
        }

        return head;
    }
}
