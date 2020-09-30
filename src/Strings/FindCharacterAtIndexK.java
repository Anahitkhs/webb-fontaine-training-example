package Strings;

import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  26, Sep, 2020
 */
public class FindCharacterAtIndexK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String");
        String string = scanner.next();

        System.out.println("Input an Index");
        int index = scanner.nextInt();

        if (index >= string.length() || index < 0) {
            System.out.println("out of bounds");
            return;
        }
        System.out.println("character at index " + index + " is " + string.charAt(index));
    }
}
