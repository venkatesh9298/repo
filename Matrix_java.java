
import java.io.*;
import java.util.*;

public class Matrix_java {
	public static void main(String[] args) throws IOException {
		int rows, cols;
		int sum = 0;
		int[][] matrix;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		rows = input.nextInt();
		System.out.print("Enter number of columns: ");
		cols = input.nextInt();
		matrix = new int[rows][cols];
		System.out.println("Enter elements for Matrix");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		System.out.println("Matrix is: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sum = sum + matrix[i][j];
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sum of all elements is: " + sum);
	}
}