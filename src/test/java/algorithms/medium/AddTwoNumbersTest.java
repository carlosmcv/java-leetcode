package algorithms.medium;

import algorithms.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class AddTwoNumbersTest {

    @Test
    public void test() {

        ListNode l1 = ListNode.create(2, 4, 3);
        ListNode l2 = ListNode.create(5, 6, 4);

        ListNode result = AddTwoNumbers.run(l1, l2);

        assertResult(result, 7, 0, 8);
    }

    private void assertResult(ListNode head, int... nums) {

        if (head == null)
            assertEquals(0, nums.length);

        if (nums.length == 0) {
            assertNull(head);
        }

        for (int i = 0; i < nums.length; i++) {
            assertEquals(nums[i], head.val);
            head = head.next;
        }

        //check if result list is not longer than expected.
        assertNull(head);
    }
}
