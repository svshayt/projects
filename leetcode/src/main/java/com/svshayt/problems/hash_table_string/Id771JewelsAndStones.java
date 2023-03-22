package com.svshayt.problems.hash_table_string;

import java.util.HashSet;
import java.util.Set;

public class Id771JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int sum = 0;
        for (char c : stones.toCharArray()) {
            if (jewels.indexOf(c) >= 0) sum++;
        }
        return sum;
    }

    public int numJewelsInStones2(String jewels, String stones) {
        Set<Character> chars = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            chars.add(c);
        }
        int sum = 0;
        for (char c : stones.toCharArray()) {
            if (chars.contains(c)) sum++;
        }
        return sum;
    }
}
