import java.util.Scanner;

class Min2Cond {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a："); int a = stdIn.nextInt();
        System.out.print("整数B："); int b = stdIn.nextInt();

        int min = a < b ? a : b;

        System.out.println("小さいほうの値は" + min + "です。");
    }
}