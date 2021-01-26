



import java.util.Scanner;
public class Factorial_num 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
	System.out.print("Enter the number to generate its factorial:");        
	int n=scn.nextInt();
	int fact=1;
	System.out.println("multiplication for table "+n+" is ");
        for(int i=1; i <= n; i++)
        {
            fact=fact*i;}
            System.out.println(n +" factoroal is "+fact);
        scn.close();
    }
}