package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Create a queue (30 April 2025).
 */
public class QueueApp {

    final static int QUEUE_SIZE = 10;
    static int[] queue = new int[QUEUE_SIZE];
    static int rearIndex = -1;
    static int frontIndex = 0;

    public static void main(String[] args) {
        printQueue();
        add(7);
        printQueue();

        add(10);
        printQueue();

        add(-5);
        printQueue();

        int removedvalued = remove();
        printQueue();
        System.out.println("Removed value: " + removedvalued);

        removedvalued = remove();
        printQueue();
        System.out.println("Removed value: " + removedvalued);

        removedvalued = remove();
        printQueue();
        System.out.println("Removed value: " + removedvalued);

    }

    public static void add(int num) {
        queue[++rearIndex] = num;
    }

    public static int remove() {
        int removedValue = queue[++frontIndex];
        queue[frontIndex - 1] = 0;
        return removedValue;
    }

    public static boolean isFull() {
        return rearIndex == queue.length - 1;
        // return top == stack.length - 1; // is it equivalent to the above?
    }

    public static boolean isEmpty() {
        return rearIndex == -1;
    }

    public static void printQueue() {
        System.out.println(Arrays.toString(queue));
        System.out.println("Rear index = " + rearIndex);
        System.out.println("Front Index = " + frontIndex);

        for (int i = frontIndex; i <= rearIndex; i++) {
            System.out.print(queue[i] + "  ");
        }
        System.out.println("\n");
    }

}
