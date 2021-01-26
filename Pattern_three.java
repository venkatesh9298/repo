

import java.util.Scanner;

public class Pattern_three  {    
    public static void main(String[] args) {
        System.out.println("How many rows you want ");
         
        Scanner sc = new Scanner(System.in);
         
        int noOfRows = sc.nextInt();
         
       
         
        System.out.println(" your pattern :");
         
        for (int i =noOfRows; i >=1 ; --i) {
        	
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"\t");
                 
                
            }
             
            System.out.println();
        }
    }    
}
