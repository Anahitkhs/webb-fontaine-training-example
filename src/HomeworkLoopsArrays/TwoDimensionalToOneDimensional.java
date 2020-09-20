package HomeworkLoopsArrays;

import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  18, Sep, 2020
 */
public class TwoDimensionalToOneDimensional {
    public static void main(String[] args) {
        int row = 2;
        int column = 3;

        int[][] array = new int[][]{{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < column; ++j) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < column; ++j) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
}

