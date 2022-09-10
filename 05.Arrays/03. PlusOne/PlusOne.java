import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        ArrayList<Integer> plusOne = new ArrayList<Integer>();
        int[] finalOutput;
        int carry = 0;
        int temp = 0;

        if (digits.length == 1 && digits[0] == 9) {
            temp = digits[0] + 1;
            while (temp != 0)
            {
                plusOne.add(temp % 10);
                temp = temp / 10;
            }
        }
        else
        {
            for (int i = digits.length - 1; i >= 0 ; i--)
            {
                if (i == 0)
                {
                    temp = digits[i] + carry;
                    if (temp > 9)
                    {
                        while (temp != 0)
                        {
                            plusOne.add(temp % 10);
                            temp = temp / 10;
                        }
                    }
                    else
                    {
                        plusOne.add(temp);
                    }
                }
                else if (i == digits.length - 1)
                {
                    temp = digits[i] + 1;
                    if (temp > 9)
                    {
                        plusOne.add(temp % 10);
                        carry = 1;
                    }
                    else
                    {
                        plusOne.add(temp);
                    }
                }
                else
                {
                    temp = digits[i] + carry;
                    if (temp > 9)
                    {
                        plusOne.add(temp % 10);
                        carry = 1;
                    }
                    else
                    {
                        plusOne.add(temp);
                        carry = 0;
                    }
                }
            }
        }

        if(digits.length == 1 && digits[0] < 9)
        {
            finalOutput = new int[1];
            finalOutput[0] = digits[0] + 1;
        }
        else
        {
            finalOutput = new  int[plusOne.size()];
            for (int k = 0; k < plusOne.size(); k++) {
                finalOutput[k] = plusOne.get(plusOne.size()-1-k);
            }
        }

        return finalOutput;
    }

    public static void main(String[] args) {

        int[] input = {9,8,9};
        int[] output = plusOne(input);
        System.out.println("Output: " + Arrays.toString(output));
    }
}
