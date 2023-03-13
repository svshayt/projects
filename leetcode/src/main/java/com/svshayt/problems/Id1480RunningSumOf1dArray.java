package com.svshayt.problems;

/**
 * 1480. Running Sum of 1d Array
 * Easy
 * 6.3K
 * 298
 * Companies
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 *
 * Return the running sum of nums.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 * Example 2:
 *
 * Input: nums = [1,1,1,1,1]
 * Output: [1,2,3,4,5]
 * Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
 * Example 3:
 *
 * Input: nums = [3,1,2,10,1]
 * Output: [3,4,6,16,17]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 1000
 * -10^6 <= nums[i] <= 10^6
 * Accepted
 * 1.4M
 * Submissions
 * 1.5M
 * Acceptance Rate
 * 87.8%
 * Seen this question in a real interview before?
 * 1/4
 * Yes
 * No
 * Discussion (71)
 * Related Topics
 * Array
 * Prefix Sum
 */
public class Id1480RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];
        if (nums.length == 1) {
            return nums;
        } else {
            sums[0] = nums[0];
        }
        for (int i = 1; i < nums.length; i++) {
            sums[i] += sums[i - 1] + nums[i];
        }
        return sums;
    }
}
