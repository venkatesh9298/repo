import java.util.Arrays;
import java.util.Scanner;

class ArrayLargeAndSmall {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number of elements in an array: ");
    int min, max;
    int n = scan.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.print("Enter the element " + (i + 1) + ": ");
      arr[i] = scan.nextInt();
    }
    System.out.println("The numbers you are entered are " + Arrays.toString(arr));
    min = arr[0];
    max = arr[0];

    for (int i = 0; i < n; i++) {

      if (arr[i] < min)
        min = arr[i];

      if (arr[i] > max)
        max = arr[i];
    }


    System.out.print("\nThe small value is: " + min);
    System.out.print("\nThe large value is: " + max);
  }// display result on the result
}
