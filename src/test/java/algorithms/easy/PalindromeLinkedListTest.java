package algorithms.easy;

import algorithms.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeLinkedListTest {

    @Test
    public void testPalindrome() {

        ListNode ll = ListNode.create(1, 2, 1);

        boolean result = PalindromeLinkedList.isPalindrome(ll);

        assertTrue(result);
    }

    @Test
    public void testNotPalindrome() {

        ListNode ll = ListNode.create(1, 2, 2);

        boolean result = PalindromeLinkedList.isPalindrome(ll);

        assertFalse(result);
    }

    @Test
    public void testOneNode() {

        ListNode ll = ListNode.create(1);

        boolean result = PalindromeLinkedList.isPalindrome(ll);

        assertTrue(result);
    }

    @Test
    public void testEmpty() {

        ListNode ll = null;

        boolean result = PalindromeLinkedList.isPalindrome(ll);

        assertTrue(result);
    }

    @Test
    public void testPalindrome2() {

        ListNode ll = ListNode.create(1, 2, 1);

        boolean result = PalindromeLinkedList.isPalindrome2(ll);

        assertTrue(result);
    }

    @Test
    public void testNotPalindrome2() {

        ListNode ll = ListNode.create(1, 2, 2);

        boolean result = PalindromeLinkedList.isPalindrome2(ll);

        assertFalse(result);
    }

    @Test
    public void testOneNode2() {

        ListNode ll = ListNode.create(1);

        boolean result = PalindromeLinkedList.isPalindrome2(ll);

        assertTrue(result);
    }

    @Test
    public void testEmpty2() {

        ListNode ll = null;

        boolean result = PalindromeLinkedList.isPalindrome2(ll);

        assertTrue(result);
    }

    @Test
    public void testPalindrome3() {

        ListNode ll = ListNode.create(1, 2, 1);

        boolean result = PalindromeLinkedList.isPalindrome2(ll);

        assertTrue(result);
    }

    @Test
    public void testNotPalindrome3() {

        ListNode ll = ListNode.create(1, 2, 2);

        boolean result = PalindromeLinkedList.isPalindrome3(ll);

        assertFalse(result);
    }

    @Test
    public void testOneNode3() {

        ListNode ll = ListNode.create(1);

        boolean result = PalindromeLinkedList.isPalindrome3(ll);

        assertTrue(result);
    }

    @Test
    public void testEmpty3() {

        ListNode ll = null;

        boolean result = PalindromeLinkedList.isPalindrome3(ll);

        assertTrue(result);
    }
}
