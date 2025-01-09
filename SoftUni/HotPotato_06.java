package SoftUni;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class HotPotato_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();
        Arrays.stream(sc.nextLine().split("\\s+")).forEach(queue::offer);
        int n = Integer.parseInt(sc.nextLine());
        int rotations = 0;
        while (queue.size() > 1) {
            String kid = queue.poll();
            rotations++;

            if (rotations % n == 0) {
                System.out.printf("Removed %s\n", kid);
            } else {
                queue.offer(kid);
            }
        }
        System.out.printf("Last is %s\n", queue.poll());
    }
}
