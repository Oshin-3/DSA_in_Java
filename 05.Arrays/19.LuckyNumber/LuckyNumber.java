import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumber {

    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> minRow = new ArrayList<Integer>();
        List<Integer> maxCol = new ArrayList<Integer>();

        for (int i = 0; i < matrix.length; i++) {
            int[] col = new int[matrix.length];
            int[] row = new int[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++) {
                //row
                row[j] = matrix[i][j];
                if (i == 0)
                {
                    for (int k = 0; k < matrix.length; k++) {
                        //col
                        col[k] = matrix[k][j];
                    }
                    Arrays.sort(col);
                    maxCol.add(col[col.length-1]);
                }

            }
            Arrays.sort(row);
            minRow.add(row[0]);
        }

        for (int i = 0; i < minRow.size(); i++) {
            for (int j = 0; j < maxCol.size(); j++) {
                if(minRow.get(i).equals(maxCol.get(j)))
                    result.add(minRow.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> output = luckyNumbers(new int[][]{{3,7,8},{9,11,13},{15,16,17}});
        System.out.println("Output: " + output);
    }
}
