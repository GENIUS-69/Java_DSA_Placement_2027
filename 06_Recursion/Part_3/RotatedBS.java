public class RotatedBS {
  public static void main(String[] args) {
    int[] arr = { 4, 5, 6, 7, 8, 1, 2, 3 };
    System.out.println(search(arr, 2, 0, arr.length - 1));
  }

  static int search(int[] arr, int key, int s, int e) {
    if (s > e)
      return -1;

    int m = s + (e - s) / 2;

    if (arr[m] == key)
      return m;

    if (arr[s] <= arr[m]) {
      if (key >= arr[s] && key <= arr[m])
        search(arr, key, s, m - 1);
      else
        search(arr, key, m + 1, e);
    }

    if (key >= arr[m] && key <= arr[e])
      search(arr, key, m + 1, e);

    return search(arr, key, s, m - 1);

  }
}
