import java.util.Scanner;

public class Neg_to_Positive
{
    public static void main(String args[]) 
    {
        int x;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number");
        x=scn.nextInt();
        if (x <= 0)
        System.out.println("the result is "+Math.abs(x));
           
        scn.close();
    }
}
