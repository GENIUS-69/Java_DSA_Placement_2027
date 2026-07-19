import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = { 3, 4, 1, 5, 2 };

    insertionSort(arr);

    System.out.println(Arrays.toString(arr));
  }

  static void insertionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int j = i + 1;
      while (j > 0) {
        if (arr[j] < arr[j - 1])
          swap(arr, j, j - 1);
        j--;
      }
    }
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}