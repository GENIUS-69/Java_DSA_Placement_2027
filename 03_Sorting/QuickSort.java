import java.util.Arrays;

public class QuickSort {
  public static void main(String[] args) {
    int[] arr = { 2, 5, 3, 1, 4, 8, 6, 9, 11 };
    quicksortalgo(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }

  static void quicksortalgo(int[] arr, int low, int high) {
    if (low >= high)
      return;

    int s = low, e = high;
    int m = s + (e - s) / 2;
    int pivot = arr[m];

    while (s <= e) {
      while (arr[s] < pivot)
        s++;

      while (arr[e] > pivot)
        e--;

      if (s <= e) {
        swap(arr, s, e);
        s++;
        e--;
      }

    }

    quicksortalgo(arr, low, e);
    quicksortalgo(arr, s, high);
  }

  static void swap(int[] arr, int s, int e) {
    int temp = arr[s];
    arr[s] = arr[e];
    arr[e] = temp;
  }
}
