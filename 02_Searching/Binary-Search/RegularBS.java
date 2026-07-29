public class RegularBS {
  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
    int target = 3;

    if (RegularBinarySearch(arr1, target) == -1)
      System.out.println("Element not found");
    else
      System.out.println("Element found at index:"+RegularBinarySearch(arr1, target));
  }

  static int RegularBinarySearch(int[] arr, int target) {
    int s = 0, e = arr.length - 1;

    while (s <= e) {
      int m = s + (e - s) / 2;
      if (target < arr[m])
        e = m - 1;
      else if (target > arr[m])
        s = m + 1;
      else
        return m;
    }
    return -1;
  }
}
