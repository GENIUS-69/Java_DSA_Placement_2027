
import java.util.Arrays;


public class FirstAndLastOcc {

  public static void main(String[] args) {
    int[] arr = { 5, 7, 7, 8, 8, 10 };
    int target = 7;

    int[] searchRes = searchRange(arr, target);

    System.out.println(Arrays.toString(searchRes));
  }

  static int[] searchRange(int[] nums, int target) {
    int[] ans = { -1, -1 };
    int start = search(nums, target, true);
    int end = search(nums, target, false);

    ans[0] = start;
    ans[1] = end;
    return ans;
  }

  static int search(int arr[], int target, boolean startIndex) {
    int s = 0, e = arr.length - 1, ans = -1;

    while (s <= e) {
      int m = s + (e - s) / 2;
      if (target < arr[m])
        e = m - 1;
      else if (target > arr[m])
        s = m + 1;
      else {
        ans = m;
        if (startIndex) {
          e = m - 1;
        } else {
          s = m + 1;
        }
      }
    }

    return ans;
  }

}