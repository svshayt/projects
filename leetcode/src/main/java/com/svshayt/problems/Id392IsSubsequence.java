package com.svshayt.problems;

/**
 * 392. Is Subsequence
 * Easy
 * 7K
 * 402
 * Companies
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 *
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 * Example 2:
 *
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 *
 *
 * Constraints:
 *
 * 0 <= s.length <= 100
 * 0 <= t.length <= 104
 * s and t consist only of lowercase English letters.
 *
 *
 * Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 109, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?
 * Accepted
 * 788K
 * Submissions
 * 1.7M
 * Acceptance Rate
 * 47.7%
 * Seen this question in a real interview before?
 * 1/4
 * Yes
 * No
 * Discussion (47)
 * Similar Questions
 * Related Topics
 * Two Pointers
 * String
 * Dynamic Programming
 */
public class Id392IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int sIndex = 0;
        for (int tIndex = 0; tIndex < t.length(); tIndex++) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            if (sIndex == s.length()) return true;
        }
        return false;
    }
}
