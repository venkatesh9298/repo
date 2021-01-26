import java.util.*; 
class SumOfTwo{
  public static void main(String[] args) {
    int num1,num2,sum;

    Scanner scn = new Scanner(System.in); 

    System.out.println("enter num1 value:");
    num1 = scn.nextInt();

    System.out.println("enter num2 value:");
    num2= scn.nextInt();

    sum = num1+num2;
    System.out.println("Sum of "+num1+"and"+num2+" is " + sum);
  }
} 