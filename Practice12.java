public class Practice12 {

  public static void main(String[] args) {
      int[][] a = {
              { 1, 2, 3 },
              { 4, 5, 6 },
      };

      System.out.println("行列A");
      for (int i = 0; i < 2; i++) {
          for (int j = 0; j < 3; j++)
              System.out.printf("%3d", a[i][j]);
          System.out.println();
      }

      int[][] b = new int[3][2];
      for (int i = 0; i < 3; i++)
          for (int j = 0; j < 2; j++)
              b[i][j] = a[j][i];

      System.out.println("行列B");
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 2; j++)
              System.out.printf("%3d", b[i][j]);
          System.out.println();
      }

      System.out.println("行列C");
      int[][] c = new int[2][2];
      for (int i = 0; i < 2; i++) {
          for (int k = 0; k < 2; k++) {
              int tmp = 0;
              for (int j = 0; j < 3; j++) {
                  tmp += a[i][j] * b[j][k];
                  c[i][k] = tmp;
              }
              System.out.printf("%3d", c[i][k]);
          }
          System.out.println();
      }
  }

}