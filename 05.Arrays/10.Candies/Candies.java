import java.util.ArrayList;
import java.util.List;

public class Candies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> finalArr = new ArrayList<Boolean>();

        for (int i = 0; i < candies.length; i++) {
            int temp = 0;
            int count = candies[i] + extraCandies;
            for (int j = 0; j < candies.length; j++) {
                temp = (count >= candies[j])? temp+1 : temp-1;
            }
            if(temp == candies.length)
            {
                finalArr.add(i,true);
            }
            else
            {
                finalArr.add(i, false);
            }
        }


        return finalArr;

    }

    public static void main(String[] args) {
        List<Boolean> outPut = kidsWithCandies(new int[]{2,3,5,1,3}, 3);
        System.out.println("Output: " + outPut);
    }
}
