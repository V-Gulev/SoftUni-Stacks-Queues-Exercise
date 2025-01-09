package SoftUni;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();
        String input = sc.nextLine();

        while (!input.equals("print")) {

            if (input.equals("cancel")) {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.printf("Canceled %s\n", queue.poll());
                }

            } else {
                queue.offer(input);
            }


            input = sc.nextLine();
        }

        queue.forEach(System.out::println);
    }
}
