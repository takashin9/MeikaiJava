package Chap15;

public class StringConstructor {
    public static void main(String[] args) {
        char[] c = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        String s1 = new String();        // 空文字列の生成
        String s2 = new String(c);       // cをもとに生成
        String s3 = new String(c, 5, 3); // c[5]から3文字
        String s4 = new String("XYZ");   // コピーコンストラクタ

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
    }
}
