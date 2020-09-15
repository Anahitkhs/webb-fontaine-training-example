package HomeworkDay1;

import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  09, Sep, 2020
 */
public class OddNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = scanner.nextInt();

        if (n % 2==0) {
            System.out.println("Even Number");
        }else
            System.out.println("Odd Number");
        System.out.println("Bye!");
    }
}
