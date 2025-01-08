package SoftUni;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        String[] tokens = sc.nextLine().split("\\s+");
        Collections.addAll(stack, tokens);

        while (stack.size() > 1) {
            int firstNumber = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int secondNumber = Integer.parseInt(stack.pop());

            int result = 0;

            if (operator.equals("+")) {
                result = firstNumber + secondNumber;
            } else {
                result = firstNumber - secondNumber;
            }


            stack.push(String.valueOf(result));

        }

        System.out.println(stack.peek());

    }
}
