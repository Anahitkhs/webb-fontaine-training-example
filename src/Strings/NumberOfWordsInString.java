package Strings;

import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  26, Sep, 2020
 */
public class NumberOfWordsInString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String");

        String string = scanner.nextLine();

        String[] words = string.split(" ");

        System.out.println("count is " + string.length());
    }
}
