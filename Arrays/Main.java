import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] arr; // definition of array
    arr = new int[5]; // initialization of array in heap default zero '0'

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    for (int num : arr) {
      System.out.println(num + ",");
    }

    System.out.println(Arrays.toString(arr)); // use of Arrays utility class
  }
}
