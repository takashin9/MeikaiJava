public class Practice15 {

    public static void main(String[] args) {

        double x = 1.0;
        double y = 1.0;
        double z = 1.0;

        double x_p = 1.0;
        double y_p = 1.0;
        double z_p = 1.0;

        double EP = 0.000000001;

        double[][] coefData = {
                { 5.0, 1.0, 1.0, 10.0 },
                { 1.0, 4.0, 1.0, 12.0 },
                { 2.0, 1.0, 3.0, 13.0 }
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%6.2f", coefData[i][j]);
            }
            System.out.println();
        }

        System.out.print("0 : ");
        System.out.print("x[0] = " + x + "   ");
        System.out.print("x[1] = " + y + "   ");
        System.out.println("x[2] = " + z + "   ");


        for (int i = 0; i <= 30; i++) {
            x = (coefData[0][3] - coefData[0][1] * y - coefData[0][2] * z) / coefData[0][0];
            y = (coefData[1][3] - coefData[1][0] * x - coefData[1][2] * z) / coefData[1][1];
            z = (coefData[2][3] - coefData[2][0] * x - coefData[2][1] * y) / coefData[2][2];

            double q = Math.abs(x - x_p) + Math.abs(y - y_p) + Math.abs(z - z_p);

            System.out.print(i + 1 + " : ");
            System.out.print("x[0] = " + x + "   ");
            System.out.print("x[1] = " + y + "   ");
            System.out.print("x[2] = " + z + "   ");
            System.out.println("q = " + q);

            x_p = x;
            y_p = y;
            z_p = z;

            if (q < EP)
                break;
        }

        System.out.println("x[0] = " + x);
        System.out.println("x[1] = " + y);
        System.out.println("x[2] = " + z);

    }
}