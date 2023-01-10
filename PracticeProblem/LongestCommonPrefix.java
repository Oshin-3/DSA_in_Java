package com.PracticeProblem;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs)
    {
        if (strs.length == 1)
        {
            return strs[0];
        }
        String value = "";
        String result = "";
        int max = Integer.MIN_VALUE;
        //find the element in the array which is longest
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() > max)
            {
                max = strs[i].length();
                value = strs[i];
            }
        }

        for (int i = 0; i < strs.length; i++) {
            boolean flg = false;
            for (int j = 0; j < strs.length; j++) {
                //conpare value's ith element with str j's ith element
                if (!value.equals(strs[j]))
                {
                    if (value.charAt(i) == strs[j].charAt(i))
                    {
                        flg = true;
                    }
                    else
                    {
                        flg = false;
                        break;
                    }
                }
            }
            if (flg)
            {
                if (!result.contains(String.valueOf(value.charAt(i))))
                {
                    result += value.charAt(i);
                }
            }
            else
            {
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
