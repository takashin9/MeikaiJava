package Chap15;

import java.util.Scanner;

public class HelloNext {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("お名前は：");
        String s = stdIn.nextLine();
        System.out.println("こんにちは" + s + "さん。");
    }
}
