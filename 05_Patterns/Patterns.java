public class Patterns {
  public static void main(String[] args) {
    // pattern1(5);
    // pattern2(5);
    // pattern3(5);
    // pattern4(5);
    // pattern5(5);
    pattern6(5);
  }

  static void pattern1(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern2(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern3(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = n; j >= i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern4(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  static void pattern5(int n) {
    for (int i = 1; i < 2 * n; i++) {
      int c = i > n ? 2 * n - i : i;
      for (int j = 0; j < c; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern6(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (j < i) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }

      System.out.println();
    }
  }
}
