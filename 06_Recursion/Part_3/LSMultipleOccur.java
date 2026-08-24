import java.util.ArrayList;

public class LSMultipleOccur {
  ArrayList<Integer> ans = new ArrayList<>();

  void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 4, 6 };
    occurence(arr, 0, 4);
    System.out.println(ans);
  }

  void occurence(int[] arr, int index, int key) {
    if (index == arr.length - 1)
      return;

    if (arr[index] == key)
      ans.add(index);

    occurence(arr, index + 1, key);
  }
}
