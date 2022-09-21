import java.util.ArrayList;

public class ReshapeMatrix {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        ArrayList<Integer> temp = new ArrayList<Integer>();
        int[][] result = new int[r][c];

        if((r*c) == (mat.length*mat[0].length))
        {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    temp.add(mat[i][j]);
                }
            }

            int k = 0;
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    //result[i][j] = (r>c)?temp.get(i):temp.get(j);
                    result[i][j] = temp.get(k);
                    k += 1;
                }
            }

            return result;
        }
        else
        {
            return mat;
        }

    }

    public static void main(String[] args) {
        int[][] output = matrixReshape(new int[][]{{1,2,3,4}}, 2, 2);
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
}
