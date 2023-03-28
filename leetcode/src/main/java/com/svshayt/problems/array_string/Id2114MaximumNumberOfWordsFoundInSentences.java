package com.svshayt.problems.array_string;

import java.util.StringTokenizer;

public class Id2114MaximumNumberOfWordsFoundInSentences {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            StringTokenizer stringTokenizer = new StringTokenizer(sentence, " ");
            max = Math.max(max, stringTokenizer.countTokens());
        }
        return max;
    }
    public int mostWordsFound2(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            int count = 1;
            for (char c : sentence.toCharArray()) {
                if (c == ' ') {
                    count++;
                }
            }
            if (count > max) max = count;
        }
        return max;
    }

    public int mostWordsFound3(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            int count = sentence.split(" ").length;
            if (count > max) max = count;
        }
        return max;
    }
}
