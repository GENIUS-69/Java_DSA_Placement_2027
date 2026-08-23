public class ProductofDigit {
  public static void main(String[] args) {
    System.out.println(digitProd(12345));
  }

  static int digitProd(int n) {
    if (n < 10)
      return n;
    return (n % 10) * digitProd(n / 10);
  }
}

