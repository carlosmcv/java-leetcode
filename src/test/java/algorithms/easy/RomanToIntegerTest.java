package algorithms.easy;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class RomanToIntegerTest {

    @Test
    public void test() {
        int result = RomanToInteger.run("III");
        assertEquals(3, result);
    }

    @Test
    public void test2() {
        int result = RomanToInteger.run("IV");
        assertEquals(4, result);
    }

    @Test
    public void test3() {
        int result = RomanToInteger.run("LVIII");
        assertEquals(58, result);
    }


    @Test
    public void test4() {
        int result = RomanToInteger.run("MCMXCIV");
        assertEquals(1994, result);
    }
}
