import java.util.*;  
class SwapOfTwo {  
    public static void main(String[] args) {  
       int x, y, temp;  
       Scanner scn = new Scanner(System.in);  
       System.out.println("Enter the value of first number : ");  
       x = scn.nextInt();  
       System.out.println("Enter the value of second number : ");  
       y = scn.nextInt();  
       System.out.println("before swapping numbers: "+x +"  "+ y);   
       temp = x;  
       x = y;  
       y = temp;  
       System.out.println("After swapping: "+x +"   " + y);  
       System.out.println( );  
       scn.close();
    }    
}  