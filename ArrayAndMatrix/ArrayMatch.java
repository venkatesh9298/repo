

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayMatch {
  static int flag = 0;

  public static void main(String[] args) {

    int[] arr = new int[8];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = ThreadLocalRandom.current().nextInt(1, 50);
    }

    System.out.println("enter three  numbers between  1-50 to success");
    Scanner sc = new Scanner(System.in);
    int input1 = sc.nextInt();
    int input2 = sc.nextInt();
    int input3 = sc.nextInt();
    search(arr, input1);
    search(arr, input2);
    search(arr, input3);
    System.out.println("entered values are " + input1 + "," + input2 + "," + input3);
    if (flag == 3)
      System.out.println("success");
    else
      System.out.println("fail");
    System.out.println("the Array elements are" + Arrays.toString(arr));
    sc.close();

  }

  private static int search(int[] arr, int ele) {

    if (arr.length == 0 || arr == null) {
      return 0;
    }

    for (int i : arr) {
      if (i == ele) {
        flag++;
      }
    }
    return 0;
  }
}
