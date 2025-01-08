package SoftUni;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        ArrayDeque<Integer> indexesStack = new ArrayDeque<>();


        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);

            if (symbol == '(') {
                indexesStack.push(i);
            } else if (symbol == ')') {
                int startIndex = indexesStack.pop();
                String subExpression = expression.substring(startIndex, i + 1);
                System.out.println(subExpression);
            }
        }


    }
}
