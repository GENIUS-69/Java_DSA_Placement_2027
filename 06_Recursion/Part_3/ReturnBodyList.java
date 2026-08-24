import java.util.ArrayList;

public class ReturnBodyList {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 4, 6 };
    System.out.println(findAllOccurence(arr, 0, 4));
  }

  static ArrayList<Integer> findAllOccurence(int[] arr, int index, int key) {
    ArrayList<Integer> ans = new ArrayList<>();
    if (index == arr.length)
      return ans;
    if (arr[index] == key)
      ans.add(index);

    ArrayList<Integer> ansFromBelowCall = findAllOccurence(arr, index + 1, key);
    ans.addAll(ansFromBelowCall);
    return ans;
  }
}
