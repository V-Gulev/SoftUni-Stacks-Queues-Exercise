package SoftUni;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MathPotato_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<String> kidsQueue = new PriorityQueue<>();
        Arrays.stream(sc.nextLine().split("\\s+")).forEach(kidsQueue::offer);
        int rotations = 0;

        while (kidsQueue.size() > 1) {
            String kid = kidsQueue.poll();
            rotations++;

            if (isPrime(rotations)) {
                System.out.printf("Prime %s\n", kid);
                kidsQueue.offer(kid);
            } else {
                System.out.printf("Removed %s\n", kid);
            }


        }
        System.out.printf("Last is %s", kidsQueue.peek());
    }

    private static boolean isPrime(int rotations) {

        if (rotations == 1) {
            return false;
        }

        for (int i = 2; i < rotations; i++) {
            if (rotations % i == 0) {
                return false;
            }
        }
        return true;
    }

}
