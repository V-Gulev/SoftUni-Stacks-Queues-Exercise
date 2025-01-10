package SoftUni;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> forwardStack = new ArrayDeque<>();
        ArrayDeque<String> historyStack = new ArrayDeque<>();

        String input = sc.nextLine();

        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (historyStack.size() > 1) {
                    forwardStack.push(historyStack.pop());
                    System.out.println(historyStack.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            } else if (input.equals("forward")) {
                if (!forwardStack.isEmpty()) {
                    historyStack.push(forwardStack.pop());
                    System.out.println(historyStack.peek());
                } else {
                    System.out.println("no next URLs");
                }
            } else {
                historyStack.push(input);
                forwardStack.clear();
                System.out.println(historyStack.peek());
            }

            input = sc.nextLine();
        }


    }
}
