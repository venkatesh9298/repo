
import java.util.Scanner;
public class Prime_intevals{
    public static void main(String args[])
    {
         int s1, s2, flag = 0, i, j;
         Scanner s = new Scanner(System.in);
         System.out.println ("Enter the lower limit :"); 
         s1 = s.nextInt();
         System.out.println ("Enter the upper limit :"); 
         s2 = s.nextInt();
         System.out.println ("The prime numbers in between the entered limits are :");
         for(i = s1; i <= s2; i++)
         {
             for( j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     flag = 1;
                     break;
                 }
                 else
                 {
                     flag = 0;
                 }
             }
             if(flag == 0)
             {
                 System.out.println(i);
             }
         }
    }
}
