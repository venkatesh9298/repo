import java.util.Scanner;

public class Denomination
{
    public static void main(String args[])
    {
        int amt, r1000=0,r100=0,r10=0, r1=0 ; 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter The number : \n\n");
        amt = sc.nextInt();
        System.out.println("entered number is "+amt+"\n the output is");
 
    while(amt >= 1000) 
 { 
  r1000 = amt / 1000 ; 
  amt = amt % 1000;
  System.out.println(r1000+"*1000 ="+r1000*1000) ;
 
  break ; 
 }
   
 while(amt >= 100) 
 { 
  r100 = amt / 100 ; 
  amt = amt % 100;
  System.out.println(r100+"*100 ="+r100*100) ;
  break ; 
 } 
 
 while(amt >= 10) 
 { 
  r10 = amt / 10 ; 
  amt = amt % 10;
  System.out.println(r10+"*10 ="+r10*10) ; 
  break ; 
 } 
 
 while(amt >= 1) 
 { 
  r1 = amt / 1 ; 
  amt = amt % 1;
  System.out.println(r1+"*1 ="+r1*1) ; 
  break ; 
 }
 
 }
}