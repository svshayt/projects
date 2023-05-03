package com.svshayt.problems.hash_table_string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Id2103RingsAndRods {
    public int countPoints(String rings) {
        int i = 0;
        Map<Integer, Set<Character>> numberToChars = new HashMap<>();
        while (i < rings.length()) {
            char color = rings.charAt(i);
            int number = rings.charAt(i + 1);
            var set = numberToChars.getOrDefault(number, new HashSet<>());
            set.add(color);
            numberToChars.put(number, set);
            i += 2;
        }
        int result = 0;
        for (var map : numberToChars.entrySet()) {
            if (map.getValue().size() == 3) result++;
        }
        return result;
    }
}
