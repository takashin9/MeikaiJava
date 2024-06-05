<<<<<<< HEAD
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = inputPositiveInteger();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]："); a[i] = input.nextInt();
        }
        printMaxElement(a);
    }
    static int inputPositiveInteger() {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("要素数："); n = input.nextInt();
        } while (n <= 0);
        return n;
    }
    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }
    static void printMaxElement(int[] arr) {
        System.out.println("最大値は" + max(arr) + "です");
=======
class Main {
    public static void main(String[] args) {
        String str1 = "こんにちは";
        String str2 = new String("こんにちは");
        System.out.println(str1 == str2);
>>>>>>> 26ae461bfde5f5fe3640f6f7f9f7d721474068c1
    }
}