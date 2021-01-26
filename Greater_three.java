import java.util.Scanner;

public class Greater_three{

  public static void main(String[] args) {

      int num1,num2,num3;
      Scanner scn= new Scanner(System.in);
      System.out.println("enter num1 value"); 
      num1=scn.nextInt();
      System.out.println("enter num2 value"); 
      num2=scn.nextInt();
      System.out.println("enter num3 value"); 
      num3=scn.nextInt();
      if( num1 >= num2 && num1 >= num3)
          System.out.println(num1+" is the largest Number");

      else if (num2 >= num1 && num2 >= num3)
          System.out.println(num2+" is the largest Number");

      else
          System.out.println(num3+" is the largest Number");
  }
}