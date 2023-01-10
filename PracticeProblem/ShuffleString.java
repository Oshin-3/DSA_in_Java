package com.PracticeProblem;

public class ShuffleString {

    public static String restoreString(String s, int[] indices) {

        String[] val = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            val[i] = String.valueOf(s.charAt(i));
        }

        for (int i = 0; i < indices.length; ) {
            int curr = indices[i];
            if (indices[i] != indices[curr])
            {
                //swap
                int temp = indices[i];
                indices[i] = indices[curr];
                indices[curr] = temp;

                String temp2 = val[i];
                val[i] = val[curr];
                val[curr] = temp2;
            }
            else
            {
                i++;
            }
        }

        String ans = "";
        for (String value : val) {
            ans += value;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3}));
    }
}
