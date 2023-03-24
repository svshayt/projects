package com.svshayt.problems.array;

public class Id1470ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffleNums = new int[2 * n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            shuffleNums[index] = nums[i];
            shuffleNums[index + 1] = nums[i + n];
            index += 2;
        }
        return shuffleNums;
    }
}
