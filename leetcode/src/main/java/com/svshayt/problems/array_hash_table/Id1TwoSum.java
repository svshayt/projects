package com.svshayt.problems.array_hash_table;

import lombok.ToString;

import java.util.HashMap;

public class Id1TwoSum {

    public int[] twoSum(int[] nums, int target) {
        var result = new int[2];
        int diff = 1;
        int i = 0;
        while (i < nums.length) {
            int j = i + diff;
            if (j >= nums.length) {
                i = 0;
                diff++;
                continue;
            } else if (nums[i] + nums[j] == target) {
                result[0] = i;
                result[1] = j;
                break;
            }
            i++;
        }
        return result;
    }

    public int[] twoSum2(int[] nums, int target) { //Runtime 1 ms | Beats 99.28%
        var result = new int[2];
        var indexToNumbers = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (indexToNumbers.containsKey(target - nums[i])) {
                result[0] = indexToNumbers.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            indexToNumbers.put(nums[i], i);
        }
        return result;
    }

    public int[] twoSum3(int[] nums, int target) {
        var indexToNumbers = new HashMap<Integer, Pair>();
        for (int i = 0; i < nums.length; i++) {
            if (indexToNumbers.containsKey(nums[i])) {
                var value = indexToNumbers.get(nums[i]);
                value.setSecond(i);
                indexToNumbers.put(nums[i], value);
            } else {
                indexToNumbers.put(nums[i], new Pair(i, -1));
            }

        }
        var result = new int[2];
        int t = 0;
        if (target % 2 == 0) {
            t = target / 2;
        }
        var pair = indexToNumbers.get(t);
        if (pair != null && pair.getSecond() != -1) {
            result[0] = pair.getFirst();
            result[1] = pair.getSecond();
            return result;
        }

        for (var indexToNumber : indexToNumbers.entrySet()) {
            if (indexToNumbers.containsKey(target - indexToNumber.getKey())) {
                result[0] = indexToNumber.getValue().getFirst();
                result[1] = indexToNumbers.get(target - indexToNumber.getKey()).getFirst();
            }
        }

        return result;
    }


    public static void main(String[] args) {
        var arr = new int[]{2, 7, 11, 15};
        var res = new Id1TwoSum().twoSum(arr, 9);
    }
}

@ToString
class Pair {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
