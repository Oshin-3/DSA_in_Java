import java.util.ArrayList;
import java.util.List;

public class AddToArrayForm {

    public static List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> finalList = new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        int carry = 0;
        int i = num.length - 1;
        while (i>=0 || k!=0 || carry > 0){
            int sum = 0;
            int temp = 0;
            temp = k % 10;
            k = k / 10;
            sum = (i<0)? temp + carry : num[i] + temp + carry;
            if( sum > 9)
            {
                carry = sum / 10;
                sum = sum % 10;
            }
            else
            {
                carry = 0;
            }
            list.add(sum);
            i -= 1;
        }

        for (int j = list.size()-1; j >= 0; j--) {
            finalList.add(list.get(j));
        }

        return finalList;
    }

    public static void main(String[] args) {
        int[] num = {7};
        int k = 993;
        List<Integer> output = addToArrayForm(num,k);
        System.out.println("Output: " + output);
    }
}
