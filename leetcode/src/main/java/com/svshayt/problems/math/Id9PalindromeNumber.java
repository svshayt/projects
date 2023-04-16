package com.svshayt.problems.math;

import java.util.ArrayList;

public class Id9PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        if (x % 10 == 0) return false;

        int xRev = reverse(x);

        return x == xRev;
    }

    public boolean isPalindrome2(int x) {
        if (x < 0) return false;

        if (x < 10) {
            return true;
        }

        if (x % 10 == 0) return false;
        int xRev = reverse(x);

        while (x > 0) {
            int r = x % 10;
            int rRev = xRev % 10;
            if (r != rRev) return false;
            x /= 10;
            xRev /= 10;
        }

        return true;
    }

    public int reverse(int x) {
        int rev = 0;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev;
    }

    public boolean isPalindrome3(int x) {
        if (x < 0) return false;

        if (x < 10) {
            return true;
        }

        var numbers = new ArrayList<Integer>();

        while (x > 0) {
            int r = x % 10;
            numbers.add(r);
            x /= 10;
        }

        int left = 0;
        int right = numbers.size() - 1;

        while (left < right) {
            if (numbers.get(left) != numbers.get(right)) return false;
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        var test = new Id9PalindromeNumber();
        System.out.println(test.isPalindrome(121));
    }
}
