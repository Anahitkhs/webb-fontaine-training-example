package HomeworkFunctionsObjects;

import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  24, Sep, 2020
 */
public class RegardingArrays {
    public static void main(String[] args) {

        static int getArrayLength () {
            Scanner scanner = new Scanner(System.in);
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter int number");
                scanner.next();
            }
            int arrayLength = scanner.nextInt();
            while (arrayLength <= 0) {
                System.out.println("Please enter valid number");
                scanner.next();
            }
            arrayLength = scanner.nextInt();
        }
        return getArrayLength;
    }

    static int[] createRandomArray(int arrayLength) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; ++i) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    static int[] createArray(int arrayLength) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; ++i) {
            System.out.println("Element: " + (i + 1));
        }
        return array;
    }

    static int[] combineArrays(int[] firstArray, int[] secondArray) {
        int length = firstArray.length + secondArray.length;
        int[] combinedArray = new int[length];
        int a = 0;
        for (int i = 0; i < firstArray.length; ++i ;){
            ++a;
            combinedArray[a] = firstArray[i];
        }
        for (int j = secondArray.length - 1; a = length - 1; j > 0 ;
        --j;
        --a){
            combinedArray[a] = secondArray[j];
        }
        return combinedArray;
    }

    static int[] getDoubledArray(int[] array) {
        int[] doubledArray = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            doubledArray[i] = array[i] * 2;
        }
        return doubledArray;
    }

    static double meanOfElement(int[] array, int arrayLength) {
        int sum = 0;
        for (int i = 0, i <arrayLength;
        ++i){
            sum += array[i];
        }
        double meanOfElement = sum / arrayLength;
        return meanOfElement;
    }

    static void arrayElementPrintout(int[] array, String message) {
        System.out.println("here is the " + message);
        for (int i : array) {
            System.out.println(i + ",");
        }
    }

    static int findIndex(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Index");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter int number");
            scanner.next();
        }
        int index = scanner.nextInt();
        while (index > array.length - 1 || index < 0) {
            System.out.println("Please enter valid number");
            scanner.next();
        }
        index = scanner.nextInt();
        return index;
    }

    static int increaseElementValue(int[] array, int index, float increaseValue) {
        array[index] = (int) (array[index] * increaseValue);
        return array[index];
    }

    static double[] createTriangle() {
        Scanner scanner = new Scanner(System.in);
        double[] triangle = new double[3];
        for (int i = 0; i < 3; ++i) {
            System.out.println("Enter side's value");
            while (!scanner.hasNextDouble()) {
                System.out.println("Enter double value");
                scanner.next();
            }
            double side = scanner.nextDouble();
            while (side <= 0) {
                System.out.println("Enter pozitiv value");
                scanner.next();
            }
            side = scanner.nextDouble();
        }
        triangle[i] = side;

        return triangle;
    }

    double calculateArea(double[] triangle, boolean checkTriangleLogic) {
        if (checkTriangleLogic == false) {
            System.out.println("Invalid sides for Triangle");
        }
        double p = 0;
        for (int i = 0; i < 3; ++i) {
            p = p + triangle[i];
        }
        p = p / 2;
        double area = Math.sqrt(p * (p - triangle[0]) * (p - triangle[1]) * (p - triangle[2]));
        return area;
    }
}



