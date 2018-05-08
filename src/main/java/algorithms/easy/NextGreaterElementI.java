//Next Greater Element I
package algorithms.easy;

import java.util.Stack;

/**
 * https://leetcode.com/problems/next-greater-element-i
 */

public class NextGreaterElementI {

    public static int[] run(int[] nums1, int[] nums2) {
        
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int[] result = new int[nums1.length];

        int max = nums2[nums2.length - 1];
        
        stack1.push(-1);
        stack1.push(max);
        
        for (int i = nums2.length - 2; i >= 0; i--) {
            
            if (nums2[i] < max) {
                stack1.push(max);
            } else {
                stack1.push(-1);
                max = nums2[i];
            }
            
            stack1.push(nums2[i]);          
        }
        
        for (int i = 0; i < nums1.length; i++) {
            int n = nums1[i];
            
            boolean found = false;
            
            while (!stack1.isEmpty() && !found) {

                int top = stack1.pop();
                
                if (top == n) {
                    result[i] = stack1.pop();
                    found = true;
                } else {
                    stack2.push(top);
                    stack2.push(stack1.pop());
                }
            }
            
            while (!stack2.isEmpty())
                stack1.push(stack2.pop());
        }
        
        return result;
    }
}