
import java.util.Scanner;

public class Pattern_seven{
	public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        
        System.out.println("Enter the number of rows ");

        int rows = scn.nextInt();
        System.out.println(" the pattern is ");
        for (int i = 0; i <= rows; i++)
        {
        	int x = 0;
        	int y = 1;
        	System.out.print(y+" ");
            for (int j = 0; j < i; j++)
            {
            	int z = x + y;
            	System.out.print(z + " ");
            	x = y;
            	y = z;
            }
            System.out.println();
        }
    }
}