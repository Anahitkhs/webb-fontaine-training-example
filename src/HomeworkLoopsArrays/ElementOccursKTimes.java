package HomeworkLoopsArrays;

import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  17, Sep, 2020
 */
public class ElementOccursKTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. create and fill array
        int ARRAY_LENGTH = 4;
        System.out.println("Please fill array");
        int[] array = new int[ARRAY_LENGTH];
        for (int i = 0; i < array.length; ++i) {
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter int");
                scanner.next();
            }
            array[i] = scanner.nextInt();
        }
        //2. find an element that occurs exactly k times
        int k = 2;
        for (int i = 0; i < array.length; ++i) {
            int counter = 0;
            for (int j = 0; j < array.length; ++j) {
                if (array[i] == array[j]) {
                    counter++;
                }
                if (counter > k) {
                    break;
                }
            }
            if (counter == k) {
                System.out.println("Required element is:" + array[i]);
                break;
            }
        }
    }
}
