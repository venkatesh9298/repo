
import java.util.Scanner;
public class Digit_Sum_single 
{
    public static void main(String args[])
    {
        int m, n;
        int l=0;
        int sum=0;
        int Sum=0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number:");
        m = scn.nextInt();
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        while (sum>0) {
        	l = sum % 10;
            Sum = Sum + l;
            sum = sum / 10;
    }
        System.out.println("Sum of Digits is"+Sum);
}
}