public class MoveChipsMinCost {

    public static int minCostToMoveChips(int[] position) {
        int cost = 0;
        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < position.length; i++) {
            if(position[i]%2 == 0)
                evenCount += 1;
            else
                oddCount += 1;
        }

        cost = (evenCount<oddCount) ? evenCount : oddCount;

        return cost;
    }

    public static void main(String[] args) {
        int output =minCostToMoveChips(new int[]{2,2,2,3,3});
        System.out.println("Output: " + output);
    }
}
