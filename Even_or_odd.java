

import java.util.Scanner;
public class Even_or_odd {
    public static void main(String[] args) {
        int n;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number:");
        n = scn.nextInt();
        if(n % 2 == 0)
        {
            System.out.println("The entered number "+n+"is even");
        }
        else
        {
        	 System.out.println("The entered number "+n+"is odd");
	}
    }
}
