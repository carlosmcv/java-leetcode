package algorithms.easy;

import algorithms.ListNode;

/**
 * https://leetcode.com/problems/palindrome-linked-list
 */
public class PalindromeLinkedList {

    private static ListNode left;

    public static boolean isPalindrome(ListNode head) {

        left = head;

        boolean result = isPalindromeUtil(head);
        return result;
    }

    private static boolean isPalindromeUtil(ListNode right)
    {

        /* stop recursion when right becomes NULL */
        if (right == null)
            return true;

        /* If sub-list is not palindrome then no need to
           check for current left and right, return false */
        boolean isp = isPalindromeUtil(right.next);
        if (isp == false)
            return false;

        /* Check values at current left and right */
        boolean isp1 = (right.val == left.val);

        /* Move left to next node */
        left = left.next;

        return isp1;
    }





    public static boolean isPalindrome2(ListNode head) {

        StringBuilder word = new StringBuilder();
        String reverse = "";

        reverse = goForStrings2(head, word, reverse);

        return word.toString().equals(reverse);
    }


    private static String goForStrings2(ListNode head, StringBuilder word, String reverse) {

        if (head == null)
            return "";

        word.append(head.val);

        return goForStrings2(head.next, word, reverse) + "" + head.val;
    }

    public static boolean isPalindrome3(ListNode head) {

        ListNode current =  head;

        String word = "";
        String reverse = "";

        while (current != null) {
            word = word + current.val;
            reverse = current.val + reverse;

            current = current.next;
        }

        return word.equals(reverse);
    }
}
