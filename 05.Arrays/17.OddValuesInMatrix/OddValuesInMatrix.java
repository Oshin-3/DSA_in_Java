public class OddValuesInMatrix {

    public static int oddCells(int m, int n, int[][] indices) {
        int result = 0;
        int[][] temp2D = new int[m][n];

        for (int i = 0; i < indices.length; i++) {
            int[] temp = indices[i];
            int r = temp[0];
            int c = temp[1];

            //row iteration
            for (int col = 0; col < n; col++) {
                temp2D[r][col] += 1;
            }

            //column iteration
            for (int row = 0; row < m; row++) {
                temp2D[row][c] += 1;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (temp2D[i][j]%2 != 0)
                    result += 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] num = {{0,1},{1,1}};
        int output = oddCells(2,3,num);
        System.out.println("Output: " + output);
    }
}
