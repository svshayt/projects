package com.svshayt.problems.hash_table_string_counting;

/**
 * 383. Ransom Note
 * Easy
 * 3.7K
 * 403
 * Companies
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 *
 *
 *
 * Example 1:
 *
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Example 2:
 *
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * Example 3:
 *
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 *
 *
 * Constraints:
 *
 * 1 <= ransomNote.length, magazine.length <= 105
 * ransomNote and magazine consist of lowercase English letters.
 * Accepted
 * 717.7K
 * Submissions
 * 1.2M
 * Acceptance Rate
 * 58.1%
 * Seen this question in a real interview before?
 * 1/4
 * Yes
 * No
 * Discussion (26)
 * Similar Questions
 * Related Topics
 * Hash Table
 * String
 * Counting
 */
public class Id383RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets = new int[26];
        for (char c : magazine.toCharArray()) {
            alphabets[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            alphabets[c - 'a']--;
            if (alphabets[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
