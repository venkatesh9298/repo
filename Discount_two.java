import java.util.Scanner;

public class Discount_two {

	public static void main(String[] args) {

		int bill;
		char ch;
		int discount;
		float afterDiscount;

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter bill amount:");
		bill = scn.nextInt();
		System.out.println("do u have membership card [y/n]");
		 ch=scn.next().charAt(0);
        if(ch=='y') {
		discount= 10 ;
	    afterDiscount = bill - (bill * discount / 100);
		System.out.println(" your net bill is: " + afterDiscount);
        }
        
        else { 
        	discount= 3 ;
    	    afterDiscount = bill - (bill * discount / 100);
    		System.out.println(" your net bill is: " + afterDiscount);

        }
	}
}
