package algorithms.easy;

/**
 * https://leetcode.com/problems/valid-palindrome-ii
 */
public class ValidPalindromeII {

    /**
     * My solution
     */
    public static boolean validPalindrome(String s) {
        return validPalindromeRecursive(s, false);
    }

    private static boolean validPalindromeRecursive(String s, boolean hasSkipped) {
        int low = 0;
        int high = s.length() - 1;

        while (low < high) {

            char cl = s.charAt(low);
            char ch = s.charAt(high);

            if (cl != ch) {

                if (!hasSkipped) {

                    if (cl == s.charAt(high - 1) && s.charAt(low + 1) == ch && low != high - 1) {

                        return validPalindromeRecursive(s.substring(low, high), true)
                                ||
                                validPalindromeRecursive(s.substring(low + 1, high + 1), true);

                    } else if (cl == s.charAt(high - 1) && low != high - 1) {
                        high--;
                        hasSkipped = true;
                    } else if (s.charAt(low + 1) == ch) {
                        low++;
                        hasSkipped = true;
                    } else {
                        return false;
                    }

                } else {
                    return false;
                }
            }

            low++;
            high--;
        }
        return true;
    }


    /**
     * Leetcode solution
     */
    public static boolean validPalindrome2(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                int j = s.length() - 1 - i;
                return (isPalindromeRange(s, i+1, j) ||
                        isPalindromeRange(s, i, j-1));
            }
        }
        return true;
    }

    public static boolean isPalindromeRange(String s, int i, int j) {
        for (int k = i; k <= i + (j - i) / 2; k++) {
            if (s.charAt(k) != s.charAt(j - k + i)) return false;
        }
        return true;
    }

    public static boolean validPalindromeLeetCode(String s) {
        int l = -1, r = s.length();
        while (++l < --r){
            if (s.charAt(l) != s.charAt(r))
                return isPalindromic(s, l, r+1) || isPalindromic(s, l-1, r);
        }

        return true;
    }

    private static boolean isPalindromic(String s, int l, int r) {
        while (++l < --r)
            if (s.charAt(l) != s.charAt(r)) return false;
        return true;
    }
}
