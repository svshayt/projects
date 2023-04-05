package com.svshayt.problems.math_greedy_sorting;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Id2160MinimumSumOfFourDigitNumberAfterSplittingDigits {

    public int minimumSum(int num) {
        int[] nums = new int[4];
        int index = 0;
        while (num > 0) {
            int r = num % 10;
            nums[index] = r;
            index++;
            num /= 10;
        }
        Arrays.sort(nums);
        int result = 10 * (nums[0] + nums[1]) + nums[2] + nums[3];
        return result;
    }

    public int minimumSum2(int num) {
        var queue = new PriorityQueue<Integer>(4);
        while (num > 0) {
            int r = num % 10;
            queue.add(r);
            num /= 10;
        }
        int result = 10 * (queue.poll() + queue.poll()) + queue.poll() + queue.poll();
        return result;
    }

    public static void main(String[] args) {
        var ex = new Id2160MinimumSumOfFourDigitNumberAfterSplittingDigits();
        ex.minimumSum(4009);
    }
}
