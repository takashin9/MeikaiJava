import java.util.Random;

class kadai1 {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("xはfloat型でyはdouble型です。");
        float x = rand.nextFloat();
        double y = (double)x;
        System.out.println("x = " + x + "(float)");
        System.out.println("y = " + y + "(double)");
    }
}