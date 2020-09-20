package HomeworkLoopsArrays;

import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  19, Sep, 2020
 */
public class PrintMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number: ");
        int n = scanner.nextInt();

        while (n != -1) {
            for (int i = 0; i < n; i++) {
                System.out.println("Java");
            }

            System.out.print("Input the number: ");
            n = scanner.nextInt();
        }
    }
}