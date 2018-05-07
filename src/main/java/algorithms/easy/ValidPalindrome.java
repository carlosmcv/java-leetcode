package algorithms.easy;

/**
 * https://leetcode.com/problems/valid-palindrome
 */
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        if (s.isEmpty())
            return true;

        int low = 0;
        int high = s.length() - 1;

        while (low < high) {

            char cl = s.charAt(low);
            while (isNotAlphanumeric(cl) && (low < high)) {
                cl = s.charAt(++low);
            }

            char ch = s.charAt(high);
            while (isNotAlphanumeric(ch) && (low < high)) {
                ch = s.charAt(--high);
            }

            if (low < high && Character.toLowerCase(cl) != Character.toLowerCase(ch))
                return false;

            low++;
            high--;
        }
        return true;
    }

    private static boolean isNotAlphanumeric(char cl) {
        return cl < '0' || (cl > '9' && cl < 'A') || cl > 'z' || (cl > 'Z' && cl < 'a');
    }
}
