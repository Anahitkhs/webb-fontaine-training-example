package HomeworkDay1;

import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  09, Sep, 2020
 */
public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int x = scanner.nextInt();
        System.out.println("Enter 2nd number:");
        int y = scanner.nextInt();
        System.out.println("Enter 3rd number:");
        int z = scanner.nextInt();

        if (x > y && x > z) {
            System.out.println("The greatest is: " + x);
        } else if (y > x && y > z) {
            System.out.println("The greatest is: " + y);
        } else if (z > x && z > y) {
            System.out.println("The greatest is: " + z);
        }
    }
}

