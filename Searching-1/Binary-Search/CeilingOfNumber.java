public class CeilingOfNumber {
  public static void main(String[] args) {
    int[] arr1 = { 2, 4, 6, 8, 10, 12, 14 };
    int target = 6;

    System.out.println("Targeted element cieling is" + CeilingOfTarget(arr1, target));
  }

  static int CeilingOfTarget(int[] arr, int target) {
    int s = 0, e = arr.length - 1, m = 0;

    while (s <= e) {
      m = s + (e - s) / 2;
      if (target < arr[m])
        e = m - 1;
      else if (target > arr[m])
        s = m + 1;
      else
        return arr[m];
    }
    return arr[m+1];
  }
}