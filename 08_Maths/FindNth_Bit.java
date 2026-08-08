public class FindNth_Bit {
  public static void main(String[] args) {
    int n = 10110110;
    int k = 3;
    System.out.println(findbit(n, k));
  }

  static int findbit(int number, int n) {
    return (number >> (n - 1)) & 1;
  }
}
