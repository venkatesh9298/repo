import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int i, size, sum = 0;
    System.out.println("Enter size of Array");
    size = scn.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter " + size + " of Array elements");
    for (i = 0; i < size; i++)
      arr[i] = scn.nextInt();

    System.out.println("the array elements are :" + Arrays.toString(arr));
    for (int number : arr) {
      sum += number;
    }

    System.out.println("Sum = " + sum);
  }
}
