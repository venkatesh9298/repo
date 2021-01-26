

import java.util.Scanner;

public class Pattern_five  {    
    public static void main(String[] args) {
        System.out.println("How many rows you want ");
         
        Scanner scn = new Scanner(System.in);
         
        int noOfRows = scn.nextInt();
        System.out.println("enter the number ");
        int value =scn.nextInt();
        int k=1;int temp=value;
        System.out.println(" your pattern :");
         
        for (int i = 1; i <= noOfRows; i++) {
            for (int j = 1; j <= noOfRows; j++) {
                System.out.print(temp+"\t");
               k++;
              temp=value*k;  
            }
            
            System.out.println();
        }scn.close();
    }    
}
