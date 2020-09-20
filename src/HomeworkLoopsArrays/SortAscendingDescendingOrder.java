package HomeworkLoopsArrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  18, Sep, 2020
 */
public class SortAscendingDescendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i, j, x;
        System.out.print("Please input Array size: ");
        n = scanner.nextInt();
        int[] array = new int[n];

        for (i = 0; i < n; ++i) {
            array[i] = (int)(Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        for (i = 0; i < n; ++i) {
            for (j = 0; j < n - 1 - i; ++j) {
                if (array[j] > array[j + 1]) {
                    x = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = x;
                }
            }
        }
        System.out.print("\nAscending Array: ");
        for (i = 0; i < n; ++i)
            System.out.print(array[i] + " ");

        System.out.print("\nDescending Array: ");
        for (i = n - 1; i >= 0; --i)
            System.out.print(array[i] + " ");
    }
}



