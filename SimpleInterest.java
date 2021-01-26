import java.util.Scanner;
public class SimpleInterest
{
    public static void main(String args[]) 
    {
        float p, r, t;
        Scanner scn = new Scanner(System.in);
        System.out.print(" Enter the principal amount: \t");
        p = scn.nextFloat();
        System.out.print("Enter the rate of interest: \t");
        r = scn.nextFloat();
        System.out.print("Enter the Time period : \n");
        t = scn.nextFloat();
        float si;
        si = (p * r * t) / 100;
        System.out.print("The Simple Interest is : " + si);
        scn.close();
    }
}