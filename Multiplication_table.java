
	import java.util.Scanner;
	public class Multiplication_table 
	{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
		System.out.print("Enter the number to generate its multiplication table:");        
		int n=s.nextInt();
		System.out.println("multiplication for table "+n+" is ");
	        for(int i=1; i <= 10; i++)
	        {
	            
	            System.out.println(n+" * "+i+" = "+n*i);
	        }
	    }
	}