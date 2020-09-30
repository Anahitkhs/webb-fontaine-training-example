package Strings;

import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  27, Sep, 2020
 */
public class RemovingDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String");
        String string = scanner.next();
        String result = "";

        for (int i = 0; i < string.length(); ++i) {
            char currentElement = string.charAt(i);
            if (!result.contains(Character.toString(currentElement))) {
                result = result + currentElement;
            }
        }
        System.out.println("After removing duplicates characters the new string is: "+ result);
    }
}
