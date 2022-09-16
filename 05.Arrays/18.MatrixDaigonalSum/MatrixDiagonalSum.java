public class MatrixDiagonalSum {

    public static int diagonalSum(int[][] mat) {
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                //primary daigonal
                if(i == j)
                    sum += mat[i][j];
                else if (j == mat[i].length-1-i)
                    sum += mat[i][j];
            }
        }

        return  sum;
    }

    public static void main(String[] args) {
        int output = diagonalSum(new int[][]{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}});
        System.out.println("Output: " + output);
    }
}
