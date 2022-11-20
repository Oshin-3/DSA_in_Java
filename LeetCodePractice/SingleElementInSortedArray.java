package com.LeetCodePractice;

public class SingleElementInSortedArray {

    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end)
        {
            int mid = start + (end - start) / 2;
            //int count = 0, tempCount = 0;

            if( (mid % 2 == 0 && nums[mid] == nums[mid +1]) || (mid %2 == 1 && nums[mid] == nums[mid - 1]) )
                start = mid + 1;
            else
                end = mid;
        }
        return nums[start];
//            for (int i = 0; i < nums.length; i++) {
//                if(nums[i] == nums[mid])
//                    count++;
//                tempCount++;
//                if (count == 2)
//                    break;
//            }
//            if (count == 1)
//                return nums[mid];
//            if (count == 2 && tempCount%2 !=0)
//                end = mid - 1;
//            else
//                start = mid + 1;
        //}

        //return -1;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8}));
    }
}
