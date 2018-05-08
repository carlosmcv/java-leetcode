package algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidParenthesesTest {

    @Test
    public void test1() {
        assertTrue(ValidParentheses.run("()"));
    }

    @Test
    public void test2() {
        assertTrue(ValidParentheses.run("()[]{}"));
    }
  
    @Test
    public void test3() {
        assertFalse(ValidParentheses.run("(({}"));
        assertFalse(ValidParentheses.run(")("));
    }
}
