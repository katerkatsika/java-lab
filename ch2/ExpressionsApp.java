package gr.aueb.cf.ch2;

/**
 * Demo για παραστάσεις ακεραίων με τη χρήση αριθμητικών τελεστών
 */
public class ExpressionsApp {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 10;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result1 = 10;
        int result2 = 20;
        int result3 = 5;

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num2 * num2;
        div = num1 / num2;
        mod = num1 % num2;

        System.out.printf("sum: %d, sub: %d, mul: %d, div: %d, mod: %d \n", sum, sub, mul, div, mod);

        result1 = result3++;
        result2 = result3 * 5;

        System.out.printf("Result1 = %d, Result2 = %d, Result3 = %d \n", result1, result2, result3);

        result1++;
        result2--;

        System.out.printf("Result1 = %d, Result2 = %d, Result3 = %d \n", result1, result2, result3);

        ++result1;
        --result2;

        System.out.printf("Result1 = %d, Result2 = %d, Result3 = %d \n", result1, result2, result3);


    }
}
