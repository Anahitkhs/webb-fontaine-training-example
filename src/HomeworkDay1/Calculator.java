package HomeworkDay1;

import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  09, Sep, 2020
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = scanner.nextInt();
        System.out.println("Enter 2nd number:");
        int b = scanner.nextInt();
        System.out.println("Enter math operation:");
        char c = scanner.next().charAt(0);

        int result;

        switch (c) {
            case '+':
                result = a + b;
                System.out.println("Result:" + a + c + b + "=" + result);
                break;
            case '-':
                result = a - b;
                System.out.println("Result:" + a + c + b + "=" + result);
                break;
            case '*':
                result = a * b;
                System.out.println("Result:" + a + c + b + "=" + result);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error:Divisor can't be 0");
                } else {
                    result = a / b;
                    System.out.println("Result:" + a + c + b + "=" + result);
                    break;
                }
        }
    }
}
