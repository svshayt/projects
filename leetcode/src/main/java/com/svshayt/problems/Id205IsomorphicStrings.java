package com.svshayt.problems;

/**
 * 205. Isomorphic Strings
 * Easy
 * 6.3K
 * 1.3K
 * Companies
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "egg", t = "add"
 * Output: true
 * Example 2:
 *
 * Input: s = "foo", t = "bar"
 * Output: false
 * Example 3:
 *
 * Input: s = "paper", t = "title"
 * Output: true
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 5 * 104
 * t.length == s.length
 * s and t consist of any valid ascii character.
 * Accepted
 * 832.7K
 * Submissions
 * 1.9M
 * Acceptance Rate
 * 42.8%
 * Seen this question in a real interview before?
 * 1/4
 * Yes
 * No
 * Discussion (75)
 * Similar Questions
 * Related Topics
 * Hash Table
 * String
 */
public class Id205IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int[] sCharNums = new int[256];
        int[] tCharNums = new int[256];
        for (int i = 0; i < 256; i++) {
            sCharNums[i] = -1;
            tCharNums[i] = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            int sIndex = s.charAt(i);
            int tIndex = t.charAt(i);

            if (sCharNums[sIndex] == -1) {
                sCharNums[sIndex] = tIndex;
                if (tCharNums[tIndex] == -1) {
                    tCharNums[tIndex] = sIndex;
                } else {
                    return false;
                }
            } else {
                if (tCharNums[tIndex] >= 0) {
                    if (!(sCharNums[sIndex] == tIndex
                            && tCharNums[tIndex] == sIndex)) return false;
                } else {
                    return false;
                }
            }

        }
        return true;
    }
}
