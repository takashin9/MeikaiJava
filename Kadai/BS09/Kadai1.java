package Kadai.BS09;

/**
 * Kadai1
 */
public class Kadai1 {
    public static void main(String[] args) {
        String[] stringValues = args[0].split(",");
        int[] intValues = new int[stringValues.length];
        for (int i = 0; i < intValues.length; i++) {
            try {
                intValues[i] = Integer.parseInt(stringValues[i]);
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }
        try {
            System.out.printf("%4d + %4d = %4d", intValues[0], intValues[1], intValues[0] + intValues[1]);
            System.out.printf("%4d - %4d = %4d", intValues[0], intValues[1], intValues[0] - intValues[1]);
            System.out.printf("%4d * %4d = %4d", intValues[0], intValues[1], intValues[0] * intValues[1]);
            System.out.printf("%4d / %4d = %4d", intValues[0], intValues[1], intValues[0] / intValues[1]);
        } catch (ArithmeticException e) {
            System.out.println(intValues[0] / 1);
        }
    }
}
