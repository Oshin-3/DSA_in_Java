package com.Search;
// ceiling - smallest number greater than the target
public class CeilingOfNumber {

    public static int ceilingOfNumber(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return arr[mid];
            else if (target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return arr[start];
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;
//            if (letters[mid] == target)
//                return letters[mid];
            if (target < letters[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        int len = letters.length;
        return letters[start%len];
    }

    public static void main(String[] args) {
        int output = ceilingOfNumber(new int[]{2,3,5,9,14,16,18}, 15);
        System.out.println("Output: " + output);


        System.out.println("Find Smallest Letter Greater Than Target:");
        char output1 = nextGreatestLetter(new char[]{'c','f','j'}, 'c');
        System.out.println("Output: " + output1);
    }
}
