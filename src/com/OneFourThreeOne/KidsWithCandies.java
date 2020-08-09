package com.OneFourThreeOne;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhm on 2020/8/9.
 */
public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int candy : candies) max = candy > max ? candy : max;
        for (int candy : candies) result.add(candy + extraCandies >= max);
        return result;
    }
}
