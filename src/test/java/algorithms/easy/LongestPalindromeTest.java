package algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromeTest {


    @Test
    public void test1() {

        int result = LongestPalindrome.longestPalindrome("abccccdd");

        assertEquals(7, result);

        System.out.println(5 / 2);
    }

    @Test
    public void test2() {

        int result = LongestPalindrome.longestPalindrome2("abccccdd");

        assertEquals(7, result);
    }

    @Test
    public void test3() {

        int result = LongestPalindrome.longestPalindrome3("abccccdd");

        assertEquals(7, result);
    }
}
