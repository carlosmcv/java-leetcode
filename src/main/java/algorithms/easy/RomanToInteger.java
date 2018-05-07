package algorithms.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/roman-to-integer
 */

public class RomanToInteger {

    public static int run(String s) {
        
        int slen = s.length();
        int i = 0;
        int result = 0;
        
        while (i < slen) {
            char r = s.charAt(i);
            if (i + 1 < slen && getValue(r) < getValue(s.charAt(i + 1))) {
                result -= getValue(r);
            } else {
                result += getValue(r);
            }
            i++;
        }

        return result;
    }

    private static int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static int run1(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put( "I", 1);
        map.put("IV", 4);
        map.put( "V", 5);
        map.put("IX", 9);   
        map.put( "X", 10);
        map.put("XL", 40);
        map.put( "L", 50);
        map.put("XC", 90);
        map.put( "C", 100);
        map.put("CD", 400);
        map.put( "D", 500);
        map.put("CM", 900);
        map.put( "M", 1000);
        
        int slen = s.length();
        int i = 0;
        int result = 0;
        
        while (i < slen) {
            
            String r = s.charAt(i) + "";
            
            if ("I".equals(r) || "X".equals(r) || "C".equals(r)) {

                if (i + 1 < slen) {
                    String r1 = s.charAt(i + 1) + "";
                    if (map.get(r) < map.get(r1)) {
                        result += map.get(r + r1);
                        i++;
                    } else {
                        result += map.get(r);
                    }
                } else {
                    result += map.get(r);
                }
            } else {
                result += map.get(r);
            }
            
            i++;
        }
        
        return result;
    }
    
    public int run2(String s) {
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            switch (c) {
            case 'I':
                res += (res >= 5 ? -1 : 1);
                break;
            case 'V':
                res += 5;
                break;
            case 'X':
                res += 10 * (res >= 50 ? -1 : 1);
                break;
            case 'L':
                res += 50;
                break;
            case 'C':
                res += 100 * (res >= 500 ? -1 : 1);
                break;
            case 'D':
                res += 500;
                break;
            case 'M':
                res += 1000;
                break;
            }
        }
	    return res;
    }

    public int run3(String s) {
        int lastValue = 0;
        int total = 0;
        int len = s.length();
        char[] chars = s.toCharArray();
        for (int i = len - 1; i >= 0; i--) {
            char c = chars[i];
            int val = getValue(c);
            if (lastValue > val) {
                total -= val;
            } else {
                total += val;
            }
            lastValue = val;
        }
        return total;
    }

    // If a letter is immediately followed by one of equal or lesser value, the two values are added;
    // If a letter is immediately followed by one of greater value, the first is subtracted from the second.
    public int run4(String s) {
        int total = 0;
        int prevValue = getValue(s.charAt(0));
        
        // loop through the rest of the string
        for (int i = 1; i < s.length(); i++) {
            int curValue = getValue(s.charAt(i));
            
            // if the current value is <= previous, we add
            // in the previous, saving current to maybe be
            // subtracted next time
            if (curValue <= prevValue) 
                total += prevValue;
            // else we are subtracting prevValue from current
            // which is really just subtracting from the total
            else 
                total -= prevValue;
            prevValue = curValue;
        }
        
        // the last value is always added
        total += prevValue;
        
        return total;
    }
}