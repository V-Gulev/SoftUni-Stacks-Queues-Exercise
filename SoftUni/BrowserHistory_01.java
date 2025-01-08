package SoftUni;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> historyStack = new ArrayDeque<>();

        String input = sc.nextLine();
        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (historyStack.size() > 1) {
                    historyStack.pop();
                    System.out.println(historyStack.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            }else {
                historyStack.push(input);
                System.out.println(historyStack.peek());
            }


            input = sc.nextLine();
        }


    }
}
