package gr.aueb.cf.ch2;

import java.math.BigDecimal;

/**
 * BigInteger class demo.
 */
public class BigInteger {
    public static void main(String[] args) {
        // Define and initialise variables
        java.math.BigInteger bigNum1 = new java.math.BigInteger("1234567890128239080237348034803823045675328403482380898274789");
        java.math.BigInteger bigNum2 = new java.math.BigInteger("1234567874840384038383784830027238403028430734273490123456789");
        java.math.BigInteger result1 = new java.math.BigInteger("6584927297420472304332");

        BigDecimal bigDec1 = new BigDecimal("759275625207017174659246924696419610410461419319137401304913791.7928640110111601465834");
        BigDecimal bigDec2 = new BigDecimal("759275625207016592201165950219659482802493689103627819011013791.7594692628645819202379");
        BigDecimal result2 = bigDec1.multiply(bigDec2);
        //Perform logic operations
        result1 = bigNum1.multiply(bigNum2);

        // Display output/results
        System.out.printf("\nIntegers multiplication = %,d \n\n", result1);
        System.out.printf("Decimals multiplication = %.45f \n", result2);

    }
}
