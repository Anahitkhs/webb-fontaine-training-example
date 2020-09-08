package HomeworkDay1;

import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  09, Sep, 2020
 */
public class AboutCoordinates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Coordinates of 1st City:");
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        System.out.println("Enter Coordinates of 2nd City:");
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();

        double x = Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));
        System.out.println("Distance between Countries is: " + x);

        double y = ((a1 - b1) / 2);
        double z = ((a2 - b2) / 2);
        System.out.println("Middle point between Countries is: " + y +","+ z);
    }
}
