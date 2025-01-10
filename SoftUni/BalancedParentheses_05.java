package SoftUni;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BalancedParentheses_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ArrayDeque<Character> openingBrackets = new ArrayDeque<>();
        boolean isBalanced = true;
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            if (symbol == '(' || symbol == '{' || symbol == '[') {
                openingBrackets.push(symbol);
            } else if (symbol == ')' || symbol == '}' || symbol == ']') {
                if (!openingBrackets.isEmpty() && matchingBrackets(symbol, openingBrackets.peek())) {
                    openingBrackets.pop();
                } else {
                    isBalanced = false;
                    break;
                }
            }

        }
        if (isBalanced) {
            System.out.println("YES");
        } else System.out.println("NO");
    }

    private static boolean matchingBrackets(char currentBracket, char previousBracket) {
        if (previousBracket == '(') {
            return currentBracket == ')';
        } else if (previousBracket == '{') {
            return currentBracket == '}';
        } else if (previousBracket == '[') {
            return currentBracket == ']';
        } else return false;

    }
}
