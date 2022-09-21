import java.util.ArrayList;
import java.util.Collections;

public class RichestWealth {
    public static int maximumWealth(int[][] accounts) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int max = 0;
        int sum = 0;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            temp.add(sum);
            sum = 0;
        }

        Collections.sort(temp);
        max = temp.get(temp.size()-1);
        return max;
    }

    public static void main(String[] args) {
        int output = maximumWealth(new int[][]{{1,2,3},{3,2,1}});
        System.out.println("Output: " + output);
    }
}
