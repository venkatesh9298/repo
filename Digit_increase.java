
import java.util.Scanner;
public class Digit_increase
{
   public static void main(String[] args) 
   {
        int n, m = 0, a;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = scn.nextInt();
        while(n > 0)
        {
            a = n % 10;
            a++;
            m = m * 10 + a;
            n = n / 10;
        }
        n = m;
        m = 0;
        while(n > 0)
        {
            a = n % 10;
            m = m * 10 + a;
            n = n / 10;
        }
        System.out.println("Result is : "+m);scn.close();
    }
}