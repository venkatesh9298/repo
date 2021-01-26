import java.util.Scanner;

public class ReverseA_number {

    public static void main(String[] args) {
    	Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number:");
        
        int num = scn.nextInt();
        System.out.println("Entered Number is : " + num);
        int  rev = 0;

        while(num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number is : " + rev);
    }
}