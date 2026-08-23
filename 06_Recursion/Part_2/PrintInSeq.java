public class PrintInSeq {
  public static void main(String[] args) {
    int n = 5;
    both(n);
  }

  static void forward(int n) {
    if (n == 0)
      return;

    System.out.print(n + " ");
    forward(n - 1);
  }

  static void backward(int n) {
    if (n == 0)
      return;
    backward(n - 1);

    System.out.print(n + " ");
  }

  static void both(int n) {
    if (n == 0)
      return;

    System.out.print(n + " ");
    both(n - 1);
    System.out.print(n + " ");
  }
}
