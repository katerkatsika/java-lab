package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Create a stack (στοίβα) (30 April 2025).
 */
public class MyStackApp {
    final static int STACK_SIZE = 10;
    static int[] stack = new int[STACK_SIZE];
    static int top = -1;

    public static void main(String[] args) {
//        boolean isEmpty = isEmpty();
//        boolean isFull = isFull();

        printStack();

        System.out.println("1st push.");
        push(5);
        printStack();

        System.out.println("2nd push.");
        push(10);
        printStack();

        System.out.println("Pop the last value.");
        int poppedValue = pop();
        System.out.println("popped value = " + poppedValue);
        printStack();

        System.out.println("Pop the last value.");
        poppedValue = pop();
        System.out.println("popped value = " + poppedValue);
        printStack();


    }

    public static void push(int num) {
        if (isFull()) {
            throw new RuntimeException("Stack is full!");
        }
        stack[++top] = num;
    }

    public static int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        //stack[top] = 0;
        int pop = stack[top--];
        stack[top + 1] = 0;
        //return stack[top--];
        return pop;
    }

    public static boolean isFull() {
        return top == STACK_SIZE - 1;
        // return top == stack.length - 1; // is it equivalent to the above?
    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public static void printStack() {
        System.out.println("Full stack: " + Arrays.toString(stack));
        System.out.println("top = " + top);

        boolean isFull = isFull();
        boolean isEmpty = isEmpty();
        System.out.println("Empty: " + isEmpty());
        System.out.println("Full: " + isFull());

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i] + "  ");
        }

        System.out.println("\n");
    }

}
