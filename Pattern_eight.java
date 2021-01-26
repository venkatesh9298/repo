

import java.util.Scanner;

public class Pattern_eight
{
	public static void main(String[] args)
    {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of rows");

        int rows = scn.nextInt();
        System.out.println("the pattern is");
        for (int i = 0; i < rows; i++)
        {
        	int num = 1;
            for (int j = 0; j <= i; j++)
            {
            	if(i ==0 || j ==0)
            		num = 1;
            	else
            		num = num * (i - j + 1)/ j;
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}