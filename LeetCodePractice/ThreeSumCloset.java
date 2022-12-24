package com.LeetCodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ThreeSumCloset {

    public static int threeSumClosest(int[] nums, int target) {

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            temp.add(nums[i] + nums[i+1] + nums[i+2]);
        }

        Collections.sort(temp);
        int start = 0;
        int end = temp.size() - 1;

        if (temp.size() == 1)
        {
            return temp.get(0);
        }
        while (start <= end)
        {
            int mid = start + (end - start) / 2;
            if (temp.get(mid).equals(target))
                return temp.get(mid);
            if (target < temp.get(mid).byteValue())
                end = mid - 1;
            else
                start = mid + 1;
        }

        return temp.get(start);
    }

    public static void main(String[] args) {
        System.out.println("Output: " + threeSumClosest(new int[]{4,0,5,-5,3,3,0,-4,-5}, -2));
    }
}
