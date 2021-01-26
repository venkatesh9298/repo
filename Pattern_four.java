
import java.util.*;

public class Pattern_four{
    public static void main(String[] args)
    {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of rows ");

        int rows = scn.nextInt();

        System.out.println("the pattern is");

        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k);
            }
            for (int l = i - 1; l >= 1; l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }scn.close();
    }
}
