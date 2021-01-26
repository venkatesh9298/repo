
import java.util.*;
public class Greater_two {
    public static void main(String[] args) {
        int x,y;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number:");
        x = scn.nextInt();
        System.out.print("Enter second  number:");
        y = scn.nextInt();
        
        if(x > y){
            System.out.println("The bigger of the two numbers entered ("+x+" and"+y+") is:"+x);
        }
        else
        	 System.out.println("The bigger of the two numbers entered ("+x+" and"+y+") is:"+y);
	    
    }
}
