package com.svshayt.problems.string_stack_simulation;

public class Id2390RemovingStarsFromAString {
    public String removeStars(String s) {
        StringBuilder res = new StringBuilder();
        int countStar = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '*') {
                countStar++;
            } else {
                if (countStar == 0) {
                    res.append(s.charAt(i));
                } else {
                    countStar--;
                }
            }
        }
        return res.reverse().toString();
    }
    public String removeStars2(String s) {
        int length = s.length();
        char[] chars = new char[length];
        int index = length - 1;
        int count = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (s.charAt(i) == '*') {
                count++;
            } else {
                if (count == 0) {
                    chars[index] = s.charAt(i);
                    index--;
                } else {
                    count--;
                }
            }
        }
        return String.valueOf(chars, index, count);
    }

    public String removeStars3(String s) {
        char[] ch = new char[s.length()];
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '*') {
                j--;
            } else {
                ch[j++] = c;
            }
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < j; i++) {
            answer.append(ch[i]);
        }

        return answer.toString();
    }

}
