
import java.util.Scanner;

public class Cubic_series {

	public static void main(String[] args) {
		int n,i;
		float sum=0;
		Scanner scn =new Scanner(System.in);
		System.out.println("enter any number");
		n=scn.nextInt();
		for(i=1;i<=n;i++)
		{
		sum=sum+(float)1/(i*i*i);
		}

		System.out.println("the sum of series ="+sum);

	}

}
