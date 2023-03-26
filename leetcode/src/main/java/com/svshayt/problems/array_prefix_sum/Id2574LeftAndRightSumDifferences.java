package com.svshayt.problems.array_prefix_sum;

public class Id2574LeftAndRightSumDifferences {
    public int[] leftRigthDifference(int[] nums) {
        int rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }
        int leftSum = 0;
        int[] answers = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            answers[i] = Math.abs(rightSum - leftSum);
            leftSum += nums[i];
        }
        return answers;
    }
}
