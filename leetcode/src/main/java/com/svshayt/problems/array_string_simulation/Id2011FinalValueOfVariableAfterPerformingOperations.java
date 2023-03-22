package com.svshayt.problems.array_string_simulation;

public class Id2011FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for (String oper : operations) {
            if (oper.charAt(1) == '+') {
                sum += 1;
            } else {
                sum -= 1;
            }
        }
        return sum;
    }
}
