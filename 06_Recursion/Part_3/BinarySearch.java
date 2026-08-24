public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = { 2, 3, 5, 7, 8, 11, 16, 18, 19 };
    System.out.println(BS(arr, 11, 0, arr.length - 1));
  }

  static boolean BS(int[] arr, int key, int start, int end) {
    if (start > end) {
      return false; // Base case: search space is empty
    }

    int mid = start + (end - start) / 2;

    if (arr[mid] == key) {
      return true;
    } else if (arr[mid] > key) {
      return BS(arr, key, start, mid - 1); // Return recursive call
    } else {
      return BS(arr, key, mid + 1, end); // Return recursive call
    }
  }
}
