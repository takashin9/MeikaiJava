import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD
        String str = "abcde";
        for ()
=======
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
>>>>>>> 6641b5f7117762da8ddb49815b58a8ffa6328bcc
    }
}