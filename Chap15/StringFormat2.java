package Chap15;

public class StringFormat2 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.printf(String.format("%%%dd\n", i), 5);
        }
    }
}
