public class FibonacciFormula {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.print(Fibo_formula(i)+" ");
    }
  }

  static int Fibo_formula(int n) {
    return (int)((Math.pow(((1 + Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
  }
}
