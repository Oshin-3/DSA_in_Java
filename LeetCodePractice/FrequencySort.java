package com.LeetCodePractice;

import java.util.*;

public class FrequencySort {

    public static int[] frequencySort(int[] nums) {

        int[] result = new int[nums.length];
        HashMap<Integer,Integer> pointer = new HashMap<>();
        Arrays.sort(nums);

        int n = 0;
        for (int i = 0; i < nums.length; ) {
            int curr = nums[i];
            int count = 0;
            for (int j = n; j < nums.length; j++) {
                if (nums[j] == curr)
                {
                    count += 1;
                    n += 1;
                }
                else
                {
                    break;
                }
            }
            pointer.put(curr, count);
            i = n;
        }

        System.out.println(pointer);
        ArrayList<Integer> distinctCount = new ArrayList<>();

        n = 0;
        for (Map.Entry<Integer,Integer> e : pointer.entrySet()) {
            int currVal = e.getValue();
            ArrayList<Integer> set = new ArrayList<>();

            if (!distinctCount.contains(currVal))
            {
                distinctCount.add(currVal);
                set = getKeys(pointer, currVal);
                if (set.size() > 1)
                {
                    Collections.reverse(set);
                }
            }

            for (int i = 0; i < set.size(); i++) {
                for (int j = 0; j < currVal; j++) {
                    result[n] = set.get(i);
                    n += 1;

                }
            }

        }



        return result;
    }

    private static ArrayList<Integer> getKeys(Map<Integer, Integer> map, Integer value) {

        ArrayList<Integer> result = new ArrayList<>();
        if (map.containsValue(value)) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (Objects.equals(entry.getValue(), value)) {
                    result.add(entry.getKey());
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Output: " + Arrays.toString(frequencySort(new int[]{1,1,2,2,2,3})));
    }
}
