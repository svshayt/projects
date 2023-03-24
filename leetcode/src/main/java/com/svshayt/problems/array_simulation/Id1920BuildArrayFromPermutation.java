package com.svshayt.problems.array_simulation;

public class Id1920BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int index = 0;
        changePlace(nums, index);
        return nums;
    }

    public void changePlace(int[] nums, int index) {
        if (index < nums.length) {
            int num = nums[index];
            int numnum = nums[num];
            changePlace(nums, index + 1);
            nums[index] = numnum;
        }
    }

    public int[] buildArray2(int[] nums) {
        int res[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[nums[i]];
        }
        return res;
    }
}
