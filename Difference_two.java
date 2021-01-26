
import java.util.*;
public class Difference_two {
    public static void main(String[] args) {
        int x,y,diff;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number:");
        x = scn.nextInt();
        System.out.print("Enter second  number:");
        y = scn.nextInt();
        diff=x-y;
        if(diff > 0){
            System.out.println("The difference of the two numbers entered ("+x+" and"+y+") is:"+ diff);
        }
        else
        	 System.out.println("The bigger of the two numbers entered ("+x+" and"+y+") is:"+Math.abs(diff));
	    
    }
}
