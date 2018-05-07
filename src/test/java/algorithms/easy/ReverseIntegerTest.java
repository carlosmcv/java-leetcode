package algorithms.easy;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {

    @Test
    public void test() {
        int result = ReverseInteger.reverse(123);
        assertEquals(321, result);
    }

    @Test
    public void test2() {
        int result = ReverseInteger.reverse(-123);
        assertEquals(-321, result);
    }

    @Test
    public void test3() {
        int result = ReverseInteger.reverse(1534236469);
        assertEquals(0, result);
    }
}
