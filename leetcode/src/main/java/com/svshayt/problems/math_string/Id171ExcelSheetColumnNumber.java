package com.svshayt.problems.math_string;

public class Id171ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        char a = 'A';
        int length = columnTitle.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            char c = columnTitle.charAt(i);
            result += (c - a + 1) * Math.pow(26, length - (i + 1));
        }
        return result;
    }
}
