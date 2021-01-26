

import java.util.Scanner;

public class Pattern_six  {    
    public static void main(String[] args) {
        System.out.println("How many rows you want ");
         
        Scanner sc = new Scanner(System.in);
         
        int noOfRows = sc.nextInt();
         
        char value = 'A';
         
        System.out.println(" your pattern :");
         
        for (int i = 1; i <= noOfRows; i++) {
            for (int j = 1; j <= noOfRows; j++) {
                System.out.print(value+"\t");
                 
                value++;
            }
             
            System.out.println();
        }
    }    
}
