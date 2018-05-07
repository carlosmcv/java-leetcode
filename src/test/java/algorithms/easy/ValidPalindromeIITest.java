package algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidPalindromeIITest {

    @Test
    public void test1() {

        String s = "aba";

        boolean valid = ValidPalindromeII.validPalindrome(s);

        assertTrue(valid);
    }

    @Test
    public void test2() {

        String s = "abca";

        boolean valid = ValidPalindromeII.validPalindrome(s);

        assertTrue(valid);
    }

    @Test
    public void test3() {

        String s = "abcea";

        boolean valid = ValidPalindromeII.validPalindrome(s);

        assertFalse(valid);
    }


    @Test
    public void test4() {

        String s = "abcddcbea";

        boolean valid = ValidPalindromeII.validPalindrome(s);

        assertTrue(valid);
    }

    @Test
    public void test5() {

        String s = "abcddcea";

        boolean valid = ValidPalindromeII.validPalindrome(s);

        assertFalse(valid);
    }


    @Test
    public void test6() {

        String s = "ebcbbececabbacecbbcbe";

        boolean valid = ValidPalindromeII.validPalindrome(s);

        assertTrue(valid);
    }

    @Test
    public void test6_short() {

        String s  = "ececabbacec";

        boolean valid = ValidPalindromeII.validPalindrome(s);

        assertTrue(valid);
    }

    @Test
    public void test7() {

        String s = "ebcbbcecabbacecbbcbe";

        boolean valid = ValidPalindromeII.validPalindrome(s);

        assertTrue(valid);
    }

    @Test
    public void test1LeetCode() {

        String s = "aba";

        boolean valid = ValidPalindromeII.validPalindromeLeetCode(s);

        assertTrue(valid);
    }

    @Test
    public void test2LeetCode() {

        String s = "abca";

        boolean valid = ValidPalindromeII.validPalindromeLeetCode(s);

        assertTrue(valid);
    }

    @Test
    public void test3LeetCode() {

        String s = "abcea";

        boolean valid = ValidPalindromeII.validPalindromeLeetCode(s);

        assertFalse(valid);
    }


    @Test
    public void test4LeetCode() {

        String s = "abcddcbea";

        boolean valid = ValidPalindromeII.validPalindromeLeetCode(s);

        assertTrue(valid);
    }

    @Test
    public void test5LeetCode() {

        String s = "abcddcea";

        boolean valid = ValidPalindromeII.validPalindromeLeetCode(s);

        assertFalse(valid);
    }


    @Test
    public void test6LeetCode() {

        String s = "ebcbbececabbacecbbcbe";

        boolean valid = ValidPalindromeII.validPalindromeLeetCode(s);

        assertTrue(valid);
    }

    @Test
    public void test6_shortLeetCode() {

        String s  = "ececabbacec";

        boolean valid = ValidPalindromeII.validPalindromeLeetCode(s);

        assertTrue(valid);
    }

    @Test
    public void test7LeetCode() {

        String s = "ebcbbcecabbacecbbcbe";

        boolean valid = ValidPalindromeII.validPalindromeLeetCode(s);

        assertTrue(valid);
    }

    @Test
    public void testRange() {

        String s = "abccba";

        boolean valid = ValidPalindromeII.isPalindromeRange(s, 0, s.length() - 1);

        assertTrue(valid);
    }

    @Test
    public void testRange2() {

        String s = "abcxcba";

        boolean valid = ValidPalindromeII.isPalindromeRange(s, 0, s.length() - 1);

        assertTrue(valid);
    }
}
