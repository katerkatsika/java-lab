package gr.aueb.cf.ch6;


import java.util.Arrays;

/**
 * Create a queue (30 April 2025).
 */
public class QueueApp2 {

    final static int QUEUE_SIZE = 7;
    static int[] queue = new int[QUEUE_SIZE];
    static int rearIndex = -1;
    //static boolean isQueueFull = false;


    public static void main(String[] args) {
//        printQueue();
//        add(1);
//        printQueue();

        for (int i = 0; i < queue.length; i++) {
            queue[i] = enQueue(i + 1);
            System.out.println(Arrays.toString(queue));
            System.out.println("rear index = " + rearIndex);
        }

//        add(2);
//        add(3);
//        add(4);
//        add(5);
//        add(6);
//        add(7);
//        printQueue();
//        add(8);
//        printQueue();

        System.out.println();
        int removedvalued = deQueue();
        System.out.println("Removed value: " + removedvalued);
        printQueue();

        removedvalued = deQueue();
        System.out.println("Removed value: " + removedvalued);
        printQueue();

        removedvalued = deQueue();
        System.out.println("Removed value: " + removedvalued);
        printQueue();

        enQueue(10);
        printQueue();
    }

    public static int enQueue(int num) { // add an element at the end of the queue

        if (isFull()) throw new RuntimeException("Queue is Full!");

        return queue[++rearIndex] = num;
    }

    public static int deQueue() { // remove the first element

        if (isEmpty()) {
            throw new RuntimeException("Queue is EMPTY!");
        }

        int removedValue = queue[0];
        rearIndex--;

        // Shift all elements one position on the left after removing the first element.
//        for (int i = 0; i < queue.length - 1; i++){
//            queue[i] = queue[i + 1];
//        }
        //queue[rearIndex + 1] = 0; // to clean up the last element and not be duplicated.
        // A different way to take the new queue
        // (but with no need to clean up the last element but also without
        // having the possibility of adding new elements afterwards.
        queue = Arrays.copyOfRange(queue, 1 , queue.length + 1);
        return removedValue;
    }

    public static void printQueue() {
        System.out.println(Arrays.toString(queue));
        System.out.println("Rear index = " + rearIndex);


        for (int i = 0; i <= rearIndex; i++) {
            System.out.print(queue[i] + "  ");
        }
        System.out.println("\n");
    }

    public static boolean isFull() {
        return rearIndex >= queue.length - 1;
    }

    public static boolean isEmpty() {
        return rearIndex < 0;
    }



}
















