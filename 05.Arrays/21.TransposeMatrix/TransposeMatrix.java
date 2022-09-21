public class TransposeMatrix {

    public static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];

        for(int i=0; i<matrix.length; i++)
        {
            for(int j=matrix[i].length-1; j>=0; j--)
            {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] output = transpose(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        
    }
}
