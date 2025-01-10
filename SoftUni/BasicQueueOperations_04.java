package SoftUni;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] elements = sc.nextLine().split("\\s+");
        int elementsToAdd = Integer.parseInt(elements[0]);
        int elementsToDequeue = Integer.parseInt(elements[1]);
        int elementToCheck = Integer.parseInt(elements[2]);
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < elementsToAdd; i++) {
            int element = sc.nextInt();
            queue.offer(element);
        }

        for (int i = 0; i < elementsToDequeue; i++) {
            queue.poll();
        }

        if (queue.isEmpty()) {
            System.out.println(0);
        } else if (queue.contains(elementToCheck)) {
            System.out.println(true);
        } else {
            System.out.println(Collections.min(queue));
        }


    }
}
