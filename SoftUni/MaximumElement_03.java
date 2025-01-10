package SoftUni;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCommand = Integer.parseInt(sc.nextLine());
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < numberOfCommand; i++) {
            String[] commands = sc.nextLine().split("\\s+");
            String command = commands[0];

            switch (command) {
                case "1":
                    int number = Integer.parseInt(commands[1]);
                    numbers.push(number);
                    break;
                case "2":
                    if (!numbers.isEmpty()) {
                        numbers.pop();
                    }
                    break;
                case "3":
                    System.out.println(Collections.max(numbers));
                    break;
                default:
                    break;
            }
        }

    }
}
