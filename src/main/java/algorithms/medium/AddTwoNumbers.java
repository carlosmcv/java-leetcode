package algorithms.medium;

import algorithms.ListNode;

/**
 * https://leetcode.com/problems/add-two-numbers
 */
public class AddTwoNumbers {

    public static ListNode run(ListNode l1, ListNode l2) {

        ListNode l3 = null;
        ListNode l3Tail = null;
        int carry = 0;

        while (l1 != null || l2 != null) {

            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;

            if (sum >= 10) {
                sum = sum % 10;
                carry = 1;
            } else {
                carry = 0;
            }

            if (l3 == null)
                l3 = l3Tail = new ListNode(sum);
            else {
                l3Tail.next = new ListNode(sum);
                l3Tail = l3Tail.next;
            }

            if (l1 != null)
                l1 = l1.next;

            if (l2 != null)
                l2 = l2.next;
        }

        if (carry > 0) {
            l3Tail.next = new ListNode(carry);
            l3Tail = l3Tail.next;
        }
        return l3;
    }
}
