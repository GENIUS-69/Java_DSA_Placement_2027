public class RotatedArrayBS {
  // Leetcode: 33
  public static void main(String[] args) {
    int[] arr = { 5, 6, 7, 0, 1, 2, 3, 4 };
    int target = 8;

    int pivot = findPivot(arr);

    int firstPass = BinarySearch(arr,target,0,pivot);
    int secondPass = BinarySearch(arr,target,pivot+1,arr.length-1);

    if(firstPass != -1 ) System.out.print("Element found at idx: "+ firstPass);
    if(secondPass != -1 ) System.out.print("Element found at idx: "+ secondPass);
    if(firstPass == -1 && secondPass == -1 ) System.out.print("Element not found at any idx ");

  }

  static int BinarySearch(int[] arr, int target,int s,int e) {

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

  static int findPivot(int[] arr) {
    int s = 0, e = arr.length - 1;

    while (s <= e) {
      int m = s + (e - s) / 2;

      if (m < e && arr[m] > arr[m + 1])
        return m;
      if (m > s && arr[m] < arr[m - 1])
        return m - 1;

      if (arr[m] >= arr[s]) {
        s = m + 1;
      } else {
        e = m - 1;
      }
    }
    return -1;
  }

}
