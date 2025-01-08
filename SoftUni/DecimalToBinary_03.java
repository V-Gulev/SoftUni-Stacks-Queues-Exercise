package SoftUni;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if (number == 0) {
            System.out.println(number);
        } else {
            while (number != 0) {
                stack.push(number % 2);
                number /= 2;
            }
        }

        stack.forEach(System.out::print);
    }
}
