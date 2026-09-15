package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Circular Queue (FIFO)
 */
public class CircularQueue {

    private static final int QUEUE_SIZE = 5;
    private static int[] queue = new int[QUEUE_SIZE];
    private static int front = 0;  // Points to the first element
    private static int rear = -1;  // Points to the last element
    private static int size = 0;   // Number of items in queue

    public static void main(String[] args) {
        printQueue();

        enqueue(7);
        enqueue(10);
        enqueue(-5);
        printQueue();

        System.out.println("Peek = " + peek());
        System.out.println("Dequeue = " + dequeue());
        printQueue();

        enqueue(100);
        enqueue(200);
        printQueue();

        System.out.println("Peek = " + peek());
    }

    public static void enqueue(int num) {
        if (isFull()) {
            throw new RuntimeException("Queue is Full!");
        }

        rear = (rear + 1) % QUEUE_SIZE;
        queue[rear] = num;
        size++;
    }

    public static int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is EMPTY!");
        }

        int removedValue = queue[front];
        queue[front] = 0; // optional cleanup

        front = (front + 1) % QUEUE_SIZE;
        size--;

        return removedValue;
    }

    public static int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is EMPTY!");
        }
        return queue[front];
    }

    public static boolean isFull() {
        return size == QUEUE_SIZE;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void printQueue() {
        System.out.println("Queue: " + Arrays.toString(queue));
        System.out.println("front = " + front + " , rear = " + rear + " , size = " + size);

        System.out.print("Active items: ");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % QUEUE_SIZE;
            System.out.print(queue[idx] + " ");
        }

        System.out.println("\n");
    }
}
