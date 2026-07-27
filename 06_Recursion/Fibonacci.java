
public class Fibonacci {
  public static void main(String[] args) {
    System.out.println(sequence(5));
    System.out.println(sequence(10));
  }

  static int sequence(int n) {
    if (n == 0)
      return 0;
    if (n == 1)
      return 1;

    return sequence(n - 1) + sequence(n - 2);
  }
}
