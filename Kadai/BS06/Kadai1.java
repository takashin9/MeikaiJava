package Kadai.BS06;

import java.util.Scanner;

public class Kadai1 {
    public static void printHello(int n) {
        while (n-- > 0) {
            System.out.println("Hello World");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("表示回数："); int n = input.nextInt();
        printHello(n);
    }
}
