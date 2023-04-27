package com.svshayt.problems.string;

public class Id58LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int max = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (max > 0) {
                    break;
                } else {
                    continue;
                }
            } else {
                max++;
            }
        }
        return max;
    }

    public int lengthOfLastWord2(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}
