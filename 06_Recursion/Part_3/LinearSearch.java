public class LinearSearch {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    System.out.println(LS(arr, 0, 4));
  }

  static int LS(int[] arr, int index, int key) {
    if (index == arr.length - 1)
      return -1;

    if (arr[index] == key)
      return index;
    
    return LS(arr, index + 1, key);
  }
}
