public class MaxValArr {
  public static void main(String[] args) {
    int[] arr = { 3, 1, 5, 2, 4 };

    System.out.println(maxval(arr));
  }

  static int maxval(int[] arr) {
    int maxValue = arr[0];

    for (int num : arr) {
      if (maxValue < num)
        maxValue = num;
    }
    return maxValue;
  }
}
