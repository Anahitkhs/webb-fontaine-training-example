package HomeworkFunctionsObjects;

import java.util.Scanner;

/**
 * Created by Anahit Khachatryan  on  24, Sep, 2020
 */
public class NumericOperations {
    public static void main(String[] args) {

        int getSumOfArguments ( int a, int b){
            int sum = a + b ;
            return sum;
        }

        int getSumOfArguments ( int...numbers){
            int sum = 0;
            for (int i : numbers) {
                sum = i + sum;
            }
            return sum;
        }

        int fibonacciRecursion ( int n){
            if (n == 0) {
                return 0;
            }
            if (n == 1 || n == 2) {
                return 1;
            }
            return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
        }

        int productOfNumbersFromOnetoN(int n){
            if (n==1){
                return 1;
            }
            return n*productOfNumbersFromOnetoN(n-1);
        }

    }
}


