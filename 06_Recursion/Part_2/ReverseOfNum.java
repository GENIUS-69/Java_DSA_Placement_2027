public class ReverseOfNum {
  public static void main(String[] args) {
    System.out.println(reverse(12345, 0));
  }

  public static int reverse(int num, int rev) {
    if (num == 0) {
      return rev;
    }
    int digit = num % 10;
    rev = rev * 10 + digit;
    return reverse(num / 10, rev);
  }
}
