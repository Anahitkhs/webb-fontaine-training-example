package HomeworkLoopsArrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  17, Sep, 2020
 */
public class ReversedArray {
    public static void main(String[] args) {
        //1. declare and allocate array
        Scanner scanner = new Scanner(System.in);
        int ARRAY_LENGTH = 5;
        System.out.println("Please fill array");
        int[] array = new int[ARRAY_LENGTH];
        for (int i = 0; i < array.length; ++i) {
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter int");
                scanner.next();
            }
            array[i] = scanner.nextInt();
        }
        //2. print array
        for (int element : array) {
            System.out.print(" " + element);
        }
        //3. create another array
        int[] reversedArray = new int[ARRAY_LENGTH];
        //4. reverse arrays
        int j = 0;
        for (int i = array.length - 1; i >= 0; --i) {
            reversedArray[j] = array[i];
            j++;
        }
        //5. print reversed array
        System.out.println();
        System.out.println("Reversed array is:");
        for (int element : reversedArray) {
            System.out.print(" " + element);
        }
    }
}

