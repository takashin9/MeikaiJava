import java.util.Scanner;

public class Kadai2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("Input month: ");
        int month = stdIn.nextInt();

        switch (month) {
            case 1: System.out.println(month + "月は冬です。"); break;
            case 2: System.out.println(month + "月は冬です。"); break;
            case 3: System.out.println(month + "月は春です。"); break;
            case 4: System.out.println(month + "月は春です。"); break;
            case 5: System.out.println(month + "月は春です。"); break;
            case 6: System.out.println(month + "月は夏です。"); break;
            case 7: System.out.println(month + "月は夏です。"); break;
            case 8: System.out.println(month + "月は夏です。"); break;
            case 9: System.out.println(month + "月は秋です。"); break;
            case 10: System.out.println(month + "月は秋です。"); break;
            case 11: System.out.println(month + "月は秋です。"); break;
            case 12: System.out.println(month + "月は冬です。"); break;
        
            default: System.out.println(month + "月はグレゴリオ暦ではありません");
                break;
        }
    }
}
