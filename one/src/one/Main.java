package one;

public class Main {
    public static void main(String[] args) {

        byte a = 0;
        short b = 1;
        int c = 2;
        long d = 3L;
        float e = 4.0F;
        double f = 5.0;
        char g = 'a';
        boolean h = true;

        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE + " Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE + " Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE + " Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE + " Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE + " Float.MAX_VALUE = " + Float.MAX_VALUE);
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE + " Double.MAX_VALUE = " + Double.MAX_VALUE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE + " Character.MAX_VALUE = " + Character.MAX_VALUE);
        System.out.println("Boolean.TRUE = " + Boolean.TRUE + " Boolean.FALSE = " + Boolean.FALSE);

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int max = arr[0];
        int min = arr[0];
        for (int i: arr) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
        }

        System.out.println("MIN = " + min);
        System.out.println("MAX = " + max);
    }
}
