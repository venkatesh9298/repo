import java.util.Scanner; 
class Employee{
  public static void main(String[] args) {
    int eno;
    String ename;
    double esal;
    double ysal;
    

    Scanner scn = new Scanner(System.in); 

    System.out.println("enter employee number : ");
    eno = scn.nextInt();
    scn.nextLine();

    System.out.println("enter employee name: ");
    ename= scn.nextLine();
    
    
    System.out.println("enter monthly salary: ");
    esal= scn.nextDouble();
    ysal=esal*12;

    System.out.println("Hi"+ename+"! Your employee id is "+eno+", monthly salary is Rs "+esal+" and yearly salary is Rs"+ysal+" ");
  }
} 