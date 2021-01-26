import java.util.Scanner;


class Armstrong_number{  
	  public static void main(String[] args)  {
		  Scanner scn = new Scanner(System.in);
		  System.out.println("enter the number");
		  int n=scn.nextInt();
	      int k=0,a,temp;  
	       
	       temp=n;  
	    while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;  
	    k=k+(a*a*a);  
	    }  
	    if(temp==k)  
	    System.out.println("armstrong number");   
	    else  
	        System.out.println("Not armstrong number");   
	   }  
	}  