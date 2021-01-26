import java.util.Scanner; 
class SumAvgOfTwo{
  public static void main(String[] args) {
    double num1,num2,num3,sum,avg;

    Scanner scn = new Scanner(System.in); 

    System.out.println("enter weight of first person : ");
    num1 = scn.nextDouble();

    System.out.println("enter weight of second person: ");
    num2= scn.nextDouble();
    
    System.out.println("enter weight of third person: ");
    num3= scn.nextDouble();

    sum = num1+num2+num3;
    avg= sum/3;
    System.out.println("The sum of weight of the 3 persons is"+sum+" Kgs and the average weight is "+avg+"Kgs");
  }
} 