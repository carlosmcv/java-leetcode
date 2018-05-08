package algorithms.easy;

import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses
 */

public class ValidParentheses {

    public static boolean run(String s) {
        
        if (s == null || s.isEmpty())
            return true;
        
        Stack<Character> stack = new Stack<Character>();
        stack.push(s.charAt(0));
        
        for (int i = 1; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek().equals(getPeer(s.charAt(i)))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        
        return stack.isEmpty();
    }

    private static char getPeer(char c) {
        switch (c) {
            case ')': return '(';
            case ']': return '[';
            case '}': return '{';
            default: return ' ';
        }
    }
}