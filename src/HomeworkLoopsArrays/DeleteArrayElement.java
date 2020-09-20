package HomeworkLoopsArrays;

import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  19, Sep, 2020
 */
public class DeleteArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 10;
        int[] array = new int[size];

        // fill the array with elements from 0 to 100
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }

        System.out.print("\nChoose an index for remove: ");
        int removeIndex = scanner.nextInt();

        if (removeIndex < 0 || removeIndex >= size) {
            System.out.println("Wrong index");
            return;
        }

        int[] result = new int[size -1];
        int currentIndex = 0;
        int originalIndex = 0;

        while (originalIndex < size) {
            if (originalIndex == removeIndex) {
                originalIndex++;
                continue;
            }

            result[currentIndex] = array[originalIndex];

            originalIndex++;
            currentIndex++;
        }

        for (int i = 0; i <size - 1 ; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
