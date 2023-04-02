package com.svshayt.problems.array_hash_table_math_counting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Id1512NumberOfGoodPairs {

    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> numberToCountNumbers = new HashMap<>();

        int result = 0;

        for (int number : nums) {
            int countNumbers = numberToCountNumbers.getOrDefault(number, 0);
            result += countNumbers;
            numberToCountNumbers.put(number, countNumbers + 1);
        }

        return result;
    }

    public int numIdenticalPairs2(int[] nums) {
        Map<Integer, List<Integer>> numberToIndexes = new HashMap<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            var indexes = numberToIndexes.get(nums[i]);
            if (indexes == null) {
                indexes = new ArrayList<>();
            }
            indexes.add(i);
            numberToIndexes.put(nums[i], indexes);
        }
        for (var numberToIndex : numberToIndexes.entrySet()) {
            if (numberToIndex.getValue().size() > 1) {
                result += countPairs(numberToIndex.getValue().size());
            }
        }
        return result;
    }

    public int countPairs(int n) {
        return n * (n - 1) / 2;
    }

    public static void main(String[] args) {
        new Id1512NumberOfGoodPairs().numIdenticalPairs(new int[]{1, 1, 1, 1, 1});
    }
}
