package gr.aueb.cf.ch2;

/**
 * Class demo for Integer data types.
 */
public class IntApp {
    public static void main(String[] args) {
        System.out.printf("Type: int, size: %d bytes, min: %,d, max: %,d.\n", Integer.BYTES, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Type: short, size: %d bytes, min: %,d, max: %,d.\n", Short.BYTES, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Type: Long, size: %d bytes, min: %,d, max: %,d.\n", Long.BYTES, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("Type: Byte, size: %d byte, min: %d, max: %d.\n", Byte.BYTES, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Type: Flot, size: %d byte, min: %f, max: %,f.\n", Float.BYTES, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("Type: Double, size: %d byte, min: %f, max: %,f.\n", Double.BYTES, Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.printf("Type: Character, size: %d byte, min: \\u%04X, max: \\u%04X.\n", Character.BYTES, (int)Character.MIN_VALUE, (int)Character.MAX_VALUE);

    }
}
