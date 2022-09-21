public class RotateMatrix {

    public static boolean findRotation(int[][] mat, int[][] target) {
        int[][] temp = new int[mat.length][mat.length];
        int rotCount = 1;
        boolean flg = false;

        do
        {
            int count = 0;
            if(rotCount > 1)
            {
                for (int i = 0; i < temp.length; i++) {
                    for (int j = 0; j < temp[i].length; j++) {
                        mat[i][j] = temp[i][j];
                    }
                }
            }
            for(int i=0; i< mat.length; i++)
            {
                for(int j=mat[i].length-1; j>=0; j--)
                {
                    temp[j][mat.length-1-i] = mat[i][j];
                }
            }
            for(int i=0; i<target.length; i++)
            {
                for(int j=0; j<target[i].length; j++)
                {
                    if(target[i][j] == temp[i][j]) {
                        count += 1;
                    }
                }
            }
            if(count == (mat.length* mat.length))
            {
                flg = true;
                break;
            }
            else
            {
                flg = false;
            }
            rotCount += 1;
        }while(rotCount <= 4);

        return flg;
    }

    public static void main(String[] args) {
        int[][] mat = {{0,1},{1,0}};
        int[][] targwet = {{1,0},{0,1}};

        boolean output = findRotation(mat,targwet);
    }
}
