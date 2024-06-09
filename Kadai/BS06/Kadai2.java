package Kadai.BS06;

import java.util.Scanner;

public class Kadai2 {
    public static int minOf(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) min = a[i];
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("要素数："); int n = input.nextInt();
        if (n <= 0) return;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]："); a[i] = input.nextInt();
        }
        System.out.println("最小値は" + minOf(a) + "です");
    }
}
