package HomeworkDay1;

import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  09, Sep, 2020
 */
public class AboutFloatingPointNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number:");
        float n = scanner.nextFloat();

        if (n == 0) {
            System.out.println("zero");
        } else if (n > 0) {
            System.out.println("positive");
        } else if (n < 0) {
            System.out.println("negative");
        }
        if (Math.abs(n) < 1) {
            System.out.println("small");
        } else if (Math.abs(n) > 1000000) {
            System.out.println("large");
        }
    }
}


