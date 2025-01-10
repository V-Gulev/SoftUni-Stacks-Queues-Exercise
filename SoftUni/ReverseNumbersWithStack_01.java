package SoftUni;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersWithStack_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();
        Arrays.stream(sc.nextLine().split("\\s+")).forEach(e -> numbersStack.push(Integer.parseInt(e)));

        while (!numbersStack.isEmpty()) {
            System.out.print(numbersStack.pop() + " ");
        }

    }
}
