public class RotationCount {
  public static void main(String[] args) {
    int[] arr = { 5, 6, 7, 0, 1, 2, 3, 4 };

    System.out.println("Rotation count is : " + findPivot(arr));
  }

  static int findPivot(int[] arr) {
    int low = 0, high = arr.length - 1;

    while (low <= high) {

      // If subarray is already sorted,
      // smallest is at low
      if (arr[low] <= arr[high])
        return low;

      int mid = (low + high) / 2;

      // Minimum is in the right half
      if (arr[mid] > arr[high])
        low = mid + 1;

      // Minimum is in the left half (could be mid)
      else
        high = mid;
    }

    return low;
  }
}