import java.util.Arrays;

public class FindIn2DArray {
  static void main() {
    int[][] arr = {
        { 1, 5, 9, 13 }, { 2, 6, 10, 14 }, { 3, 6, 9, 15 }, { 4, 8, 12, 16 }
    };

    int target = 10; // 1,2
    System.out.println(Arrays.toString(LS2Darray(arr, target)));

  }

  static int[] LS2Darray(int[][] arr, int target) {

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] == target)
          return new int[] { i, j };
      }
    }

    return new int[] { 0, 0 };
  }
}
