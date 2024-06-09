package Chap07;

import java.util.Scanner;

public class BitwiseOperation {
    static void printBits(int x) {
        for (int i = 31; i >= 0; i--) {
            System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("2つの整数を入力してください");
        System.out.print("a："); int a = input.nextInt();
        System.out.print("b："); int b = input.nextInt();
        System.out.print("a     = "); printBits(a);
        System.out.print("\nb     = "); printBits(b);
        System.out.print("\na & b = "); printBits(a & b);
        System.out.print("\na | b = "); printBits(a | b);
        System.out.print("\na ^ b = "); printBits(a ^ b);
        System.out.print("\n~a    = "); printBits(~a);
        System.out.print("\n~b    = "); printBits(~b);
    }
}
