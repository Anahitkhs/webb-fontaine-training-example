package Strings;

import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  27, Sep, 2020
 */
public class Parenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String");
        String string = scanner.next();
        int openParenthesisCount = 0;
        int closeParenthesisCount = 0;

        for (int i = 0; i < string.length(); ++i) {
            if (string.charAt(i) == '(') {
                openParenthesisCount++;
            } else if (string.charAt(i) == ')') {
                closeParenthesisCount++;
            } else {
                System.out.println("invalid character");
                return;
            }

            if (closeParenthesisCount > openParenthesisCount) {
                System.out.println("Invalid");
                return;
            }
        }

        if (closeParenthesisCount == openParenthesisCount) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
