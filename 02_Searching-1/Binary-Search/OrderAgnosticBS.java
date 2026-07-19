
public class OrderAgnosticBS {
  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
    int[] arr2 = { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    int target = 3;

    if (OrderABS(arr1, target) == -1)
      System.out.println("Element not found");
    else
      System.out.println("Element found at index:" + OrderABS(arr1, target));

    if (OrderABS(arr2, target) == -1)
      System.out.println("Element not found");
    else
      System.out.println("Element found at index:" + OrderABS(arr2, target));
  }

  static int OrderABS(int[] arr, int target) {
    int s = 0, e = arr.length - 1;

    boolean isAsc = arr[s] < arr[e];

    while (s <= e) {
      int m = s + (e - s) / 2;

      if (arr[m] == target)
        return m;

      if (isAsc) {
        if (target < arr[m])
          e = m - 1;
        else if (target > arr[m])
          s = m + 1;
      } else {
        if (target > arr[m])
          e = m - 1;
        else if (target < arr[m])
          s = m + 1;
      }
    }
    return -1;
  }
}
