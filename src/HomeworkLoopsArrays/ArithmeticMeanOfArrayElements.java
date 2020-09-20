package HomeworkLoopsArrays;

import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  17, Sep, 2020
 */
public class ArithmeticMeanOfArrayElements {
    public static void main(String[] args) {
        //1. Array creation
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        System.out.println("Please enter array elements");
        double[] array = new double[10];
        for (double i = 0; i < array.length; ++i) {
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter double number");
                scanner.next();
            }
            array[(int) i] = scanner.nextDouble();
        }
        //2. Colculation of arithmetic mean
        for (int i = 0; i < array.length; ++i) {
            sum = sum + array[i];
        }
        double average = sum / array.length;
        System.out.println("Arithmetic Mean of Array Elements is:" + average);
    }
}
