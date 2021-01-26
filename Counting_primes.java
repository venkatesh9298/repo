import java.util.Scanner;

public class Counting_primes {

	public static void main(String[] args) {
		int temp , n, count = 0; 
		Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number:");
        n=scn.nextInt();
        temp=n;
        while (temp != 0) { 
            
            int d = temp % 10; 
             temp /= 10;
           if (d == 2 || d == 3
               || d == 5 || d == 7) 
               count++ ; 
     
         } System.out.println("the no of primes :"+count);
	}

}

      
       