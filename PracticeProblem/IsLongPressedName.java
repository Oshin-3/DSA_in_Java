package com.PracticeProblem;

public class IsLongPressedName {

    public static boolean isLongPressedName(String name, String typed) {
        boolean flg = false;
        int i = 0, j = 0;

        if (name.charAt(0) != typed.charAt(0))
        {
            return false;
        }
        if (name.length() > typed.length())
        {
            return false;
        }

        while (i < name.length() && j < typed.length())
        {
            if (name.charAt(i) == typed.charAt(j))
            {
                i++;
                j++;
            }
            else if (name.charAt(i-1) == typed.charAt(j))
            {
                j++;
            }
            else
            {
                return false;
            }
        }
        while(j<typed.length()){       //Step 4 & 5
            if(name.charAt(i-1) == typed.charAt(j)){
                j++;
            }
            else{
                return false;
            }
        }
        if(i<name.length()){      // step 6
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String name = "leelee";
        String typed = "lleeelee";
        System.out.println("Output: " + isLongPressedName(name, typed));
    }
}
