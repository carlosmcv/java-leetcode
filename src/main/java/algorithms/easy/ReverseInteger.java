package algorithms.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode.com/problems/reverse-integer
 */

public class ReverseInteger {

    public static int reverse(int x) {
        int y = x;
        int r = 0;
        int n = 0;
        int i = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        
        do {
            r = y % 10;
            queue.add(Math.abs(r));
            y = y / 10;
        } while (y != 0);
        
        i = queue.size() - 1;
        
        while (!queue.isEmpty()) {
            int z = queue.poll();
            int p = (int)Math.pow(10, i--);
            
            if (
                (x >= 0 && z > (Integer.MAX_VALUE - n) / p)
               ||
                (x < 0  && -z < (Integer.MIN_VALUE + n) / p)
               ) {
                return 0;
            }
            
            n = n + (z * p);
        }
        return n * (x < 0 ? -1 : 1);
    }

    public static int reverse1(int x) {
        long result = 0;
        long num = (long) x;
        while (num != 0){
            result *= 10;
            result += num % 10;
            num /= 10;
        }
        int test = (int) result;
        if (test == result) return test;
        return 0;
    }

    public static int reverse2(int x) {
        boolean isNeg = x < 0;
        int num = Math.abs(x);
        
        List<Integer> list = new ArrayList<>();
        while(num > 0) {
            int digit = num % 10;
            list.add(digit);
            num /= 10;
        }
        int acc = 0;
        try {
            while (!list.isEmpty()) {
                int digit = list.remove(0);
                acc = Math.addExact(Math.multiplyExact(acc, 10), digit);
            }
        } catch (Exception e) {
            return 0;
        }
        
        return isNeg ? -(acc) : acc;
    }

    public int reverse3(int x) {
        int result = 0;
        while (x != 0){
            int temp = result * 10 + x % 10;
            if (result != temp / 10){
                return 0;
            }
            result = temp;
            x /= 10;
        }
        return result;
    }
}