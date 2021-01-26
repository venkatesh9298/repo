
import java.util.Scanner;

public class CalciSwitch {

  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    System.out.print("Enter two numbers: ");

    // nextDouble() reads the next double from the keyboard
    double first = scn.nextDouble();
    double second = scn.nextDouble();
     scn.nextLine();
    System.out.print("Enter an operation (add, sub, mul, div ): ");
    String str = scn.nextLine();

    double result;

    switch (str) {
      case "add":
        result = first + second;
        break;

      case "sub":
        result = first - second;
        break;

      case"mul":
        result = first * second;
        break;

      case "div":
        result = first / second;
        break;

     
      default:
        System.out.printf("Error! operation is not correct");
        return;
    }

    System.out.println(str+" of "+ first  +" and  "+ second + " = " + result);
  }
}