package Strings;

import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  27, Sep, 2020
 */
public class DivideStringIfPossible {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String");
        String string = scanner.next();

        System.out.println("Input a number of parts");
        int numberOfParts = scanner.nextInt();

        if (string.length() % numberOfParts != 0) {
            System.out.println("Invalid/can't be divided");
            return;
        }
        System.out.println("The parts of divided string are: ");
        int lengthOfPart = string.length() / numberOfParts;
        for (int i = 0; i < string.length(); i += lengthOfPart) {
            System.out.println(string.substring(i, i + lengthOfPart));
        }
    }
}