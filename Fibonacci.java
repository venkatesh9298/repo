
import java.util.*;
public class Fibonacci {

    public static void main(String[] args) {
    	Scanner scn = new Scanner(System.in);
		int n,t1 = 0, t2 = 1;
		System.out.println("enter the value of N");
		n=scn.nextInt();
        

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + "  ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}