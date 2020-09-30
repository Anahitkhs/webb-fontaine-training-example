package Strings;

import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  27, Sep, 2020
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String");
        String string = scanner.next();

        for (int i = 0; i < string.length()/2; ++i) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
