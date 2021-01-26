
        
import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {

		int bill;
		int discount= 10;

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter bill amount:");
		bill = scn.nextInt();
        if(bill > 6000) {
		
		int afterDiscount = bill - (bill * discount / 100);
		System.out.println(" your net bill is: " + afterDiscount);
        }
         if (bill < 6000 )
		System.out.println("your net  bill is: " + bill);
         scn.close();
	}
}
