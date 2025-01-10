package SoftUni;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> numberStack = new ArrayDeque<>();
        String[] elements = sc.nextLine().split("\\s+");
        int elementsToPush = Integer.parseInt(elements[0]);
        int elementsToPop = Integer.parseInt(elements[1]);
        int checkElement = Integer.parseInt(elements[2]);

        for (int i = 0; i < elementsToPush; i++) {
            int input = sc.nextInt();
            numberStack.push(input);
        }
        for (int i = 0; i < elementsToPop; i++) {
            numberStack.pop();
        }
        if (numberStack.isEmpty()) {
            System.out.println(0);
        } else if (numberStack.contains(checkElement)) {
            System.out.println(true);
        } else {
            System.out.println(Collections.min(numberStack));
        }
    }
}
