package SoftUni;

import java.util.Scanner;

public class RecursiveFibonacci_06 {
    private static long[] fibonacciMemory;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        fibonacciMemory = new long[n + 1];
        long fibonacci = getFibonacci(n);
        System.out.println(fibonacci);

    }

    private static long getFibonacci(int n) {

        if (n <= 1) {
            return 1;
        } else {
            if (fibonacciMemory[n] != 0) {
                return fibonacciMemory[n];
            }
        }

        long currentFibonacci = getFibonacci(n - 1) + getFibonacci(n - 2);
        fibonacciMemory[n] = currentFibonacci;


        return currentFibonacci;

    }


}
