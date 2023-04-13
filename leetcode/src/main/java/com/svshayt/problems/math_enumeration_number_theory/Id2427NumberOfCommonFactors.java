package com.svshayt.problems.math_enumeration_number_theory;

public class Id2427NumberOfCommonFactors {
    public int commonFactors(int a, int b) {
        int commonFactors = 0;
        if (a % b == 0 || b % a == 0) commonFactors++;
        for (int i = 1; i <= Math.min(a, b) / 2; i++) {
            if (a % i == 0 && b % i == 0) {
                commonFactors++;
            }
        }
        return commonFactors;
    }
}
