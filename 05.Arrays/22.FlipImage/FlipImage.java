public class FlipImage {

    public static int[][] flipAndInvertImage(int[][] image) {

        int[][] result = new int[image.length][image[0].length];

        //flipping
        for(int i=0; i<image.length; i++)
        {
            for(int j=0; j<image[i].length; j++)
            {
                result[i][image[i].length-1-j] = image[i][j];
            }
        }

        //inverthing
        for(int i=0; i<result.length; i++)
        {
            for(int j=0; j<result[i].length; j++)
            {
                result[i][j] = result[i][j] == 1? 0 : 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] output = flipAndInvertImage(new  int[][]{{1,1,0},{1,0,1},{0,0,0}});
        
    }
}
