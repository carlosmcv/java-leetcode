package algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidPalindromeTest {

    @Test
    public void test1 () {

        String s = "A man, a plan, a canal: Panama";

        boolean valid = ValidPalindrome.isPalindrome(s);

        assertTrue(valid);
    }

    @Test
    public void test2 () {

        String s = "A.,a";

        boolean valid = ValidPalindrome.isPalindrome(s);

        assertTrue(valid);
    }

    @Test
    public void test3() {

        String s = "A                           ,a";

        boolean valid = ValidPalindrome.isPalindrome(s);

        assertTrue(valid);
    }

    @Test
    public void test4() {

        String s = "race a car";

        boolean valid = ValidPalindrome.isPalindrome(s);

        assertFalse(valid);
    }
}
