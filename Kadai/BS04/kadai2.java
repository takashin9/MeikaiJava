public class kadai2 {
    public static void main(String[] args) {
        float f = 0f;
        int i = 0;
        System.out.println("   float   int");
        System.out.println("----------------");
        for (i = 0; i <= 1000; i++, f += 0.001f) {
            System.out.printf("%11.7f%11.7f\n", f, (float)i/1000);
        }
    }
}
