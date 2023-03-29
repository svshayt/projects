package com.svshayt.problems.string_greedy;

public class Id1689PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public int minPartitions(String n) {
        for (int i = 9; i > 0; i--) {
            if (n.indexOf('0' + i) >= 0) return i;
        }
        return 0;
    }

    public int minPartitions2(String n) {
        int max = -1;
        for(char c : n.toCharArray()) {
            if (c - '0' > max) max = c - '0';
        }
        return max;
    }
}
