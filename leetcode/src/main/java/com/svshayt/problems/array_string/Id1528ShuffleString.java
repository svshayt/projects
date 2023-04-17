package com.svshayt.problems.array_string;

public class Id1528ShuffleString {
    public String restoreString(String s, int[] indices) {
        var res = new StringBuilder(s);
        for (int i = 0; i < indices.length; i++) {
            res.setCharAt(indices[i], s.charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        var test = new Id1528ShuffleString();
        System.out.println(test.restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3}));
    }
}
