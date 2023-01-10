package com.PracticeProblem;

import javax.swing.plaf.IconUIResource;

public class ConvertToTitle {

    public static String convertToTitle(int columnNumber) {

        int count = 0;

        while (columnNumber > 9)
        {
            columnNumber -= 26;
            count += 1;
        }
         String ans = "";

        while (count > 9)
        {
            ans += alphabets(count);
        }
        ans += alphabets(count);
        ans += alphabets(columnNumber);

        return ans;
    }

    public static char alphabets(int n)
    {
        char ch = 'A';
        int i = n + ch - 1;
        ch = (char) i;

        return ch;
    }


    public static void main(String[] args) {
        int count = 1;
        //count = count+64;
        System.out.println(convertToTitle(701));
    }
}
