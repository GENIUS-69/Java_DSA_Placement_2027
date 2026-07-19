public class SearchInRange {
  static void main(String[] args) {
    int[] arr = { 1, 3, 2, 5, 4 };
    int target = 1;

    if (LS(arr, target, 1, 4)) {
      System.out.println("element found");
    } else {
      System.out.println("elemwnt not found");
    }
  }

  static boolean LS(int[] arr, int target, int start, int end) {

    for (int i = start; i <= end; i++) {
      if (arr[i] == target)
        return true;
    }

    return false;
  }
}
