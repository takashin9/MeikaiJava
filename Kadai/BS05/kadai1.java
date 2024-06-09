class kadai1 {
    public static void main(String[] args) {
        int H = 2, W = 3;

        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
        };

        int[][] B = new int[W][H];

        for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
            B[j][i] = A[i][j];
        }
        }

        System.out.println("B = {");
        for (int i = 0; i < B.length; i++) {
        System.out.print("   {");
        for (int j = 0; j < B[i].length; j++) {
            System.out.print(B[i][j] + ", ");
        }
        System.out.println("},");
        }
        System.out.println("}");

        int[][] C = new int[H][H];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < H; j++) {
                for (int k = 0; k < W; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("C = {");
        for (int i = 0; i < C.length; i++) {
        System.out.print("   {");
        for (int j = 0; j < C[i].length; j++) {
            System.out.print(C[i][j] + ", ");
        }
        System.out.println("},");
        }
        System.out.println("}");

        int[][] D = new int[W][W];

        for (int i = 0; i < W; i++) {
            for (int j = 0; j < W; j++) {
                for (int k = 0; k < H; k++) {
                    D[i][j] += B[i][k] * A[k][j];
                }
            }
        }

        System.out.println("D = {");
        for (int i = 0; i < D.length; i++) {
        System.out.print("   {");
        for (int j = 0; j < D[i].length; j++) {
            System.out.print(D[i][j] + ", ");
        }
        System.out.println("},");
        }
        System.out.println("}");
    }
}