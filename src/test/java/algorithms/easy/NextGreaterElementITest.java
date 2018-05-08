package algorithms.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NextGreaterElementITest {

    @Test
    public void test1() {

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] expectedResult = {-1, 3, -1};
        
        int[] result = NextGreaterElementI.run(nums1, nums2);
        
        for (int i = 0; i < expectedResult.length; i++) {
            assertEquals(expectedResult[i], result[i]);
        }
    }

}

