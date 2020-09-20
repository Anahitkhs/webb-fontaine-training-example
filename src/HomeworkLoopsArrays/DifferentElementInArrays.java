package HomeworkLoopsArrays;

import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  17, Sep, 2020
 */
public class DifferentElementInArrays {
    public static void main(String[] args) {
        //1.create 1st array
        Scanner scanner = new Scanner(System.in);
        int ARRAY_LENGTH = 3;
        int arrays;

        int[] array1 = new int[ARRAY_LENGTH];
        System.out.println("Enter elements of 1st array");
        for (int i = 0; i < array1.length; ++i) {
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter int");
                scanner.next();
            }
            array1[i] = scanner.nextInt();
        }
        //2. create 2nd array
        int[] array2 = new int[ARRAY_LENGTH];
        System.out.println("Enter elements of 2nd array");
        for (int i = 0; i < array2.length; ++i) {
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter int");
                scanner.next();
            }
            array2[i] = scanner.nextInt();
        }
        //3. find different element
        for (int i = 0; i < ARRAY_LENGTH; ++i) {
            if (array1[i] != array2[i]) {
                System.out.println("Different element is:" + array1[i]);
            }
        }
    }
}

