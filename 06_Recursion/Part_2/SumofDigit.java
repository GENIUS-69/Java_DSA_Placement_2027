public class SumofDigit {
  public static void main(String[] args) {
    System.out.println(digitSum(12345));
  }

  static int digitSum(int n) {
    if (n < 10)
      return n;
    return (n % 10) + digitSum(n / 10);
  }
}
