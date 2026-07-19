import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/

public class ListOfDuplicate {
  public List<Integer> findDuplicates(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int correct = arr[i] - 1;
      if (correct != i)
        swap(arr, i, correct);
      else
        i++;
    }

    List<Integer> ans = new ArrayList<>();
    for (int idx = 0; idx < arr.length; idx++) {
      if (arr[idx] != idx + 1) {
        ans.add(arr[idx]);
      }
    }

    return ans;
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }

}
