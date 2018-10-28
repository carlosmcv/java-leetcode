//Next Greater Element I
package algorithms.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * https://leetcode.com/problems/next-greater-element-ii
 */

public class NextGreaterElementII {

    public static int[] run(int[] nums) {
        Stack<int[]> stack = new Stack<>();
        
        int len = nums.length;
        
        if (len == 0)
            return nums;
        
        int[] result = new int[len];
        Arrays.fill(result, -1);

        int i = 0;
        
        boolean go = true;
            
        while (go) {
            
            int n = nums[i];   
            
            while (!stack.isEmpty() && ((int[])stack.peek())[1] < n) {
                int key = ((int[])stack.pop())[0];            
                if (result[key] == -1) {
                    result[key] = n;
                }
            }

            if (!stack.isEmpty() && (stack.size() == len || ((int[])stack.peek())[0] == i))
                go = false;
            
            stack.push(new int[]{i, n});
            
            i = ++i % len;
        }
        
        return result;
    }


    public static int[] run2(int[] nums) {
        
        Stack<int[]> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        int len = nums.length;
        
        if (len == 0)
            return nums;
        
        int[] result = new int[len];

        int i = 0;
        
        boolean go = true;
            
        while (go) {
            
            int n = nums[i];
            
            if (stack.size() == len)
                go = false;
            
            while (!stack.isEmpty() && ((int[])stack.peek())[1] < n) {
                int key = ((int[])stack.pop())[0];
                if (map.get(key) == null)
                    map.put(key, n);
            }
            
            stack.push(new int[]{i, n});
            
            i = ++i % len;
        } 
        
        
        for (int j = 0; j < nums.length; j++) {
            
            if (map.get(j) != null)
                result[j] = map.get(j);
            else
                result[j] = -1;      
        }
        
        return result;
    }
}