import java.util.Arrays;

public class ArrayModification {
  public static void main(String args[]) {
    int A[] = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};


    System.out.println("Array elements before modifications" + Arrays.toString(A));
    // computes the sum of element 0 to 14 and stores it at element 15;
    int sum = 0;
    for (int i = 0; i < 15; i++)
      sum += A[i];
    System.out.println(sum);
    A[15] = sum;
    // computes the average and stores it at element 16
    int avg;
    avg = sum / 15;
    A[16] = avg;

    // identifies the smallest value from the array and stores it at element 17.
    int min = A[0];
    for (int i = 0; i < 15; i++) {
      if (A[i] < min)
        min = A[i];
    }
    A[17] = min;
    System.out.println("Array elements After modifications" + Arrays.toString(A));

  }
}
