import java.util.ArrayList;

public class ReturnArrayList {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 4, 6 };
    ArrayList<Integer> ans = new ArrayList<>();
    findAllOccurence(arr, 0, 4, ans);
    System.out.println(ans);
  }

  static ArrayList<Integer> findAllOccurence(int[] arr, int index, int key, ArrayList<Integer> ans) {
    if (index == arr.length - 1)
      return ans;
    if (arr[index] == key)
      ans.add(index);
    return findAllOccurence(arr, index + 1, key, ans);
  }
}
