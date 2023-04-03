package com.svshayt.problems.math_two_pointers_brainteaser;

public class Id2396MathTwoPointersBrainteaser {
    public boolean isStrictlyPalindromic(int n) {
        // return false; - always
        for (int i = 2; i <= n - 2; i++) {
            var nToBaseString = Integer.toString(n, i);
            if (!isPalindromic(nToBaseString)) return false;
        }
        return true;
    }

    public boolean isPalindromic(String str) {
        if (str.length() == 1) return true;
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        var result = new Id2396MathTwoPointersBrainteaser().isStrictlyPalindromic(4);
        System.out.println(result);
    }
}
