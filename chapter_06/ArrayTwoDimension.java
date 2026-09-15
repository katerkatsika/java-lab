package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * 2-D Table
 */
public class ArrayTwoDimension {

    public static void main(String[] args) {
        int[][] grid = new int[2][3];

        grid[0][0] = 2;
        grid[0][1] = 5;
        grid[0][2] = 1;
        grid[1][0] = 7;
        grid[1][1] = 8;
        grid[1][2] = 4;

        int[][] grid2 = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        //traverse
        for (int i = 0; i < grid.length; i++) {
            System.out.print("{");
            for (int j = 0; j < grid[i].length; j++) {
                System.out.printf(" %d " , grid[i][j]);
//                System.out.print(grid[i][j]);
            }
            System.out.print("}");
            System.out.println();
        }

        //traverse with enhanced for
        for (int[] elemRow : grid2) {
            for (int elemCol : elemRow) {
                System.out.printf("%d ", elemCol);
            }
            System.out.println();
        }

    }
}
