package com.LeetCodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[0] > 0)
                return result;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k)
            {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0)
                {
                    if (!result.contains(Arrays.asList(nums[i], nums[j], nums[k])))
                    {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
                else if(nums[j]+nums[k] < -nums[i]){
                    j++;
                }else{
                    k--;
                }

            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> output = threeSum(new int[]{-1,0,1,2,-1,-4});
        for (int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i));
        }
    }
}
