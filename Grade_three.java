
import java.util.Scanner;

public class Grade_three{

  public static void main(String[] args) {

      int num1,num2,num3,total;
      float avg;
      Scanner scn= new Scanner(System.in);
      System.out.println("Enter the marks scored in 1st subject:"); 
      num1=scn.nextInt();
      System.out.println("Enter the marks scored in 2nd subject:"); 
      num2=scn.nextInt();
      System.out.println("Enter the marks scored in 3rd subject:"); 
      num3=scn.nextInt();
      total=num1+num2+num3;
      avg=total/3;
      System.out.println("total marks: "+total);
      System.out.println("average is"+avg);
      
      if( avg < 35)
          System.out.println("Grade is C");

      else if (avg <65 && avg > 35)
    	  System.out.println("Grade is B");

      else
    	  System.out.println("Grade is A");
       
      scn.close();
  }
}