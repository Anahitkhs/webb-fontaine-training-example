package HomeworkDay1;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  08, Sep, 2020
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter natural number");
        int number = scanner.nextInt();
        for (int i = 1; i < 10; ++i) {
            System.out.println(number + "*" + i + "=" + i * number);
        }
    }
}