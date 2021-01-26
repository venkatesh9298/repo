import java.util.Scanner;

public class Fact_while {

    public static void main(String[] args) {
    	Scanner scn = new Scanner(System.in);
    	while(true) {
        System.out.println("enter the number");
        int n =scn.nextInt();
        long fact = 1;
        int i = 1;
        
        while(i<=n)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+n+" is: "+fact);
    }
}
}