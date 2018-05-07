package algorithms.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TwoSumTest {

    @Test
    public void testFoundSolution() {

        int[] result = TwoSum.run(new int[]{1,2,3,4,8,6}, 8);

        assertEquals("[1, 5]", Arrays.toString(result));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNotFoundSolutionWithTargetInArray() {

        int[] result = TwoSum.run(new int[]{1,2,3,4,8,1}, 8);

        assertEquals("[1, 5]", Arrays.toString(result));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNotFoundSolution2() {
        int[] result = TwoSum.run(new int[]{1,2,3,4,8,6}, 1);
    }
}
