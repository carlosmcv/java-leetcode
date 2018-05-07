package algorithms.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/longest-palindrome
 */
public class LongestPalindrome {

    /**
     * My solution
     */
    public static int longestPalindrome(String s) {

        if (s.length() >= 1010)
            throw new IllegalArgumentException("Not valid string");

        Map<Character, Integer> counts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Integer count = counts.get(s.charAt(i));
            counts.put(s.charAt(i), count != null ? count + 1 : 1);
        }

        int longest = 0;
        boolean oddCountFound = false;

        for (Integer count : counts.values()) {

            if (count % 2 == 0)
                longest += count;
            else {
                longest += (count - 1);
                oddCountFound = true;
            }
        }

        return longest + (oddCountFound ? 1 : 0);
    }

    /**
     * Leetcode solution
     */
    public static int longestPalindrome2(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v : count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1)
                ans++;
        }
        return ans;
    }

    public static int longestPalindrome3(String s) {
        if (s == null || s.length() == 0) return 0;

        int[] chars = new int[256];
        for (char c : s.toCharArray()) {
            chars[c]++;
        }

        int countOdd = 0;
        for (int i = 0; i < 256; i++) {
            if (chars[i] % 2 != 0) countOdd++;
        }

        return countOdd > 0 ? s.length() - countOdd + 1 : s.length();
    }
}
