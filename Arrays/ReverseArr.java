
import java.util.Arrays;

public class ReverseArr {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6 };

    reverse(arr);

    System.out.println(Arrays.toString(arr));
  }

  static void reverse(int[] arr) {
    for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
      if (start == end)
        break;
      else
        swap(start, end, arr);
    }
  }

  static void swap(int x, int y, int[] arr) {
    arr[x] = (arr[x] + arr[y]) - (arr[y] = arr[x]);
  }
}
