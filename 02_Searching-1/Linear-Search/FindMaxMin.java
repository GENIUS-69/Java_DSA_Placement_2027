public class FindMaxMin {
  static void main() {
    int[] arr = { 1, 3, 2, 5, 4 };
    MinMaxLS(arr);
  }

  static void MinMaxLS(int[] arr) {
    int max = arr[0], min = arr[1];
    for (int num : arr) {
      if (num > max)
        max = num;
      if (num < min)
        min = num;
    }

    System.out.println("Max=" + max + " Min=" + min);
  }
}
