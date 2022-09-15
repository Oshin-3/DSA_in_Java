import java.util.Arrays;

public class AddToZero {

    public static int[] sumZero(int n) {
        int[] finalArr =  new int[n];

        int j = -n/2;
        for (int i = 0; i < finalArr.length; i++) {
            if (n%2 != 0)
            {
                finalArr[i] = j;
                j += 1;
            }
            else
            {
                if(j != 0)
                {
                    finalArr[i] = j;
                    j += 1;
                }
                else
                {
                    j += 1;
                    i -= 1;
                }

            }
        }

        return finalArr;
    }

    public static void main(String[] args) {
        int[] output = sumZero(4);
        System.out.println("Output: " + Arrays.toString(output));
    }
}
