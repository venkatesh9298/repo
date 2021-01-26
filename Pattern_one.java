
import java.util.Scanner;

public class Pattern_one  {    
    public static void main(String[] args) {
        System.out.println("How many rows you want ");
         
        Scanner sc = new Scanner(System.in);
         
        int noOfRows = sc.nextInt();
         
        int value = 0;
         
        System.out.println(" your pattern :");
         
        for (int i = 1; i <= noOfRows; i++) {
        	value++;
            for (int j = 1; j <= i; j++) {
                System.out.print(value+"\t");
                 
                
            }
             
            System.out.println();
        }
    }    
}
