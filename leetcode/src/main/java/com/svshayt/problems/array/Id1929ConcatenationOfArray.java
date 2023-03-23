package com.svshayt.problems.array;

public class Id1929ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length * 2];
        System.arraycopy(nums, 0, res, 0, nums.length);
        System.arraycopy(nums, 0, res, nums.length, nums.length);
        return res;
    }

    public int[] getConcatenation2(int[] nums) {
        int[] res = new int[nums.length * 2];
        for (int i = 0; i < (nums.length * 2); i++) {
            res[i] = nums[i % nums.length];
        }
        return res;
    }
}
