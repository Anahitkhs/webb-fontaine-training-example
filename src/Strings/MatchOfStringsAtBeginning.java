package Strings;

import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  27, Sep, 2020
 */
public class MatchOfStringsAtBeginning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Original String");
        String originalString = scanner.nextLine();

        System.out.println("Input Given String");
        String givenString = scanner.next();

        System.out.println(originalString.startsWith(givenString));
    }
}
