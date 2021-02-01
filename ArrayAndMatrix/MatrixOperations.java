import java.util.Scanner;

public class MatrixOperations {

  public static void main(String[] args) {
    System.out.print("Enter No of Rows and Columns ");
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int columns = sc.nextInt();

    System.out.println("Enter  " + rows * columns + " elements : ");

    int arr[][] = new int[rows][columns];


    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    // System.out.println("Array is"+Arrays.deepToString(arr));
    System.out.println("Array elements are ");
    System.out.println();

    for (int[] x : arr) {
      for (int y : x) {
        System.out.print(y + "\t");
      }
      System.out.println();
    }
    sc.close();

    // sum of matrix elements
    int sum = 0;
    for (int[] x : arr) {
      for (int y : x) {
        sum += y;
      }
    }
    System.out.println();
    System.out.println();


    System.out.println("the Sum of Elements is " + sum);
    // biggest element of the matrix
    int max = arr[0][0];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        if (arr[i][j] > max)
          max = arr[i][j];
      }
    }
    System.out.println();
    System.out.println();

    System.out.println("The biggest element in the matrix is " + max);
    // Diagonal sum
    int tsum = 0;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        if (i == j)
          tsum += arr[i][j];
      }
    }
    System.out.println();
    System.out.println();

    System.out.println("The Diagonal sum of the matrix is " + tsum);
    // Transpose of a matrix;
    int[][] trns = new int[columns][rows];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        trns[j][i] = arr[i][j];
      }
    }
    System.out.println();
    System.out.println();

    System.out.println("The transposed matrix is ");
    System.out.println();

    for (int[] x : trns) {
      for (int y : x) {
        System.out.print(y + "\t");
      }
      System.out.println();
    }
  }
}
