import java.util.Scanner;

class Sports_club{
  public static void main(String[] args) {
   
    String name;
    double mno;
    int age;
    

    Scanner scn = new Scanner(System.in); 

    System.out.println("enter name : ");
    name= scn.nextLine();
    
   
    System.out.println("enter mobile number: ");
    mno= scn.nextDouble();

    System.out.println("enter age : ");
    age = scn.nextInt();
     if (age < 18) {
    System.out.println("Sorry! You need to be at least 18 years old to get membership.");
    return;
     }
    System.out.println("Congratulations "+name+" for your successful registration.");
   
    

    
  }
} 
