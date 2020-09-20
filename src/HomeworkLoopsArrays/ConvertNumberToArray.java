package HomeworkLoopsArrays;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  18, Sep, 2020
 */
public class ConvertNumberToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. enter number
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        int[] digits = Integer.toString(num).chars().map(c -> c - '0').toArray();

        //2. convert entered number into array
        System.out.println("Here is Array: ");
        for (int d : digits)
            System.out.println(d);

        int ARRAY_LENGTH = 3;
        int[] array = new int[ARRAY_LENGTH];
        for (int i = 0; i < array.length; ++i) {
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter int");
                scanner.next();
            }
            array[i] = scanner.nextInt();
        }
    }
}
