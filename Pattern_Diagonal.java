
import java.util.Scanner;

public class Pattern_Diagonal  {    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("How many rows you want ");
        int noOfRows = sc.nextInt();
        System.out.println("enter any number ");
        int n=sc.nextInt();
       
         
        System.out.println(" your pattern :");
         
        for (int i = 1; i <= noOfRows; i++) {
            for (int j = 1; j <= noOfRows; j++) {
            	if (i==j)
                System.out.print(n+"\t");
            	else 
            		System.out.print("0"+"\t");
                 
                
            }
             
            System.out.println();
        }
    }    
}
