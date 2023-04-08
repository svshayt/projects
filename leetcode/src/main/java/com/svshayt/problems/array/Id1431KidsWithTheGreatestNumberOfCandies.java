package com.svshayt.problems.array;

import java.util.ArrayList;
import java.util.List;

public class Id1431KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = -1;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        for (int candy : candies) {
            var bool = candy + extraCandies >= max;
            result.add(bool);
        }
        return result;
    }
}
