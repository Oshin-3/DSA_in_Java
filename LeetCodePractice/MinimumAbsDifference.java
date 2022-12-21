package com.LeetCodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsDifference {

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> result = new ArrayList<>();

        int[] temp = new int[arr.length-1];

        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            temp[i] = arr[i+1] - arr[i];
        }

        int min = temp[0];
        for (int i = 1; i < temp.length; i++) {
            min = Math.min(temp[i], min);
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == min)
            {
                List<Integer> t = new ArrayList<>();
                t.add(arr[i]);
                t.add(arr[i+1]);
                result.add(t);
            }
        }
//        for (int i = 0; i < t.size()/2; i++) {
//            result.add(t);
//        }

        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> output = minimumAbsDifference(new int[]{4,2,1,3});

    }
}
