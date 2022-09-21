public class Altitude {

    public static int largestAltitude(int[] gain) {

        int result = 0;
        int[] altitude = new int[gain.length+1];
        altitude[0] = 0;
        int j = 1;
        for(int i=0; i<gain.length; i++)
        {
            altitude[j] = gain[i] + altitude[i];
            j += 1;
        }

        for(int i=0; i<altitude.length; i++)
        {
            for(int k=i+1; k<altitude.length; k++)
            {
                if(altitude[i] > altitude[k])
                {
                    int temp = altitude[i];
                    altitude[i] = altitude[k];
                    altitude[k] = temp;
                }
            }
        }

        result = altitude[altitude.length-1];
        return result;
    }

    public static void main(String[] args) {
        int output = largestAltitude(new int[]{-4,-3,-2,-1,4,3,2});
        System.out.println("Output: " + output);
    }
}
