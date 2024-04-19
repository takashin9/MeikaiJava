import java.util.Scanner;

class Kadai1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("Integer: ");
        int a = stdIn.nextInt();
        System.out.print("Integer: ");
        int b = stdIn.nextInt();

        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }

        System.out.println("\nSort result :");
        System.out.println("\t1: " + a);
        System.out.println("\t2: " + b);
    }
}