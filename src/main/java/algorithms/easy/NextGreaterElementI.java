//Next Greater Element I
package algorithms.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * https://leetcode.com/problems/next-greater-element-i
 */

public class NextGreaterElementI {

    public static int[] run(int[] nums1, int[] nums2) {
        
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        if (nums1.length == 0)
            return nums1;
        
        int[] result = new int[nums1.length];
        
        for (int i = 0; i < nums2.length; i++) {
            
            int n = nums2[i];
            
            while (!stack.isEmpty() && stack.peek() < n) {
                map.put(stack.pop(), n);
            }
            
            stack.push(n);
        }
        
        for (int i = 0; i < nums1.length; i++) {
            int n = nums1[i];
            
            if (map.get(n) != null)
                result[i] = map.get(n);
            else
                result[i] = -1;      
        }
        
        return result;
    }
}