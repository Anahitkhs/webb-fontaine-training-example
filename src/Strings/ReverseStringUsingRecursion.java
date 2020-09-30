package Strings;

import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  27, Sep, 2020
 */
public class ReverseStringUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String");
        String string = scanner.next();

        System.out.println(reverse(string));
    }

    public static String reverse(String text) {
        if (text.isEmpty()) {
            return "";
        }
        return text.charAt(text.length() - 1) + reverse(text.substring(0, text.length() - 1));
    }
}

