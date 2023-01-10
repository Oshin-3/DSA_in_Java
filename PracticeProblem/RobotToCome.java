package com.PracticeProblem;

public class RobotToCome {

    public static boolean judgeCircle(String moves) {

        int[] position = {0,0};
        moves = moves.toUpperCase();
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U')
            {
                position[1] += 1;
            } else if (moves.charAt(i) == 'R') {
                position[0] += 1;
            }
            else if (moves.charAt(i) == 'D')
            {
                position[1] -= 1;
            }
            else
            {
                position[0] -= 1;
            }
        }

        if (position[0] == 0 && position[1] == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Output: " + judgeCircle("RRDD"));
    }
}
