import java.util.Scanner;

class Kadai3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("性：");
        String s = stdIn.nextLine();
        System.out.print("名：");
        String t = stdIn.next();
        System.out.println("こんにちは" + s + t + "さん");    
    } 
}