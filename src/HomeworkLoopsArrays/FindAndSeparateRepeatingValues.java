package HomeworkLoopsArrays;

import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  19, Sep, 2020
 */
public class FindAndSeparateRepeatingValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. create arrays
        int arraySize1 = 4;
        int arraySize2 = 5;
        int[] array1 = new int[arraySize1];
        int[] array2 = new int[arraySize2];

        //2. fill arrays
        System.out.println("Input Array1:");
        for (int i = 0; i < arraySize1; ++i) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("Input Array2:");
        for (int i = 0; i < arraySize2; ++i) {
            array2[i] = scanner.nextInt();
        }
        //3.find repeating values and print
        System.out.println("Result: ");
        for (int i = 0; i < arraySize1; ++i) {
            int element = array1[i];
            for (int j = 0; j < arraySize2; ++j) {
                if (element == array2[j]) {
                    System.out.println(element);
                    break;
                }
            }
        }
    }
}
