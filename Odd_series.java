import java.util.Scanner;
public class Odd_series {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner scn =new Scanner(System.in);
		System.out.println("enter any number");
		n=scn.nextInt();
		for (int i = 1; i <= n; i++) {
			   if (i % 2 != 0) {
				System.out.print(i + " ");
				sum=sum+i;
			   }
		
	}System.out.println();System.out.println("the sum of series is "+sum);
}
}

