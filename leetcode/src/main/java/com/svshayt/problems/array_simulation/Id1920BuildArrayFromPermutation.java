package com.svshayt.problems.array_simulation;

public class Id1920BuildArrayFromPermutation {

    // a = a + n * b;
    // n - size
    // a - original number a = a % n
    // b - final number    b = a / n
    public int[] buildArray(int[] nums) {

        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] + n * (nums[nums[i]] % n);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] / n;
        }
        return nums;
    }

    public int[] buildArray2(int[] nums) {
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

    public int[] buildArray3(int[] nums) {
        int res[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[nums[i]];
        }
        return res;
    }
}
