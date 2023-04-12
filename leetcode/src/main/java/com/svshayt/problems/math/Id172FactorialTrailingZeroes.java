package com.svshayt.problems.math;

public class Id172FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int countZeroes = 0;
        int step = 5;

        while (step <= n) {
            countZeroes += n / step;
            step *= 5;
        }

        return countZeroes;
    }

    public int trailingZeroes2(int n) {
        int n5 = 5;
        int n25 = 25;
        int n125 = 125;
        int n625 = 625;
        int n3125 = 3125;

        int countZeroes = 0;
        if (n < 5) return 0;
        int m = n3125;
        while (m <= n) {
            countZeroes++;
            m += n3125;
        }
        m = n625;
        while (m <= n) {
            countZeroes++;
            m += n625;
        }
        m = n125;
        while (m <= n) {
            countZeroes++;
            m += n125;
        }
        m = n25;
        while (m <= n) {
            countZeroes++;
            m += n25;
        }
        m = n5;
        while (m <= n) {
            countZeroes++;
            m += n5;
        }
        return countZeroes;
    }
}
