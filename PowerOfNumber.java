import java.util.Scanner;

public class PowerOfNumber {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int m,n;long res = 1;
        System.out.println("enter the vales of m and n");
        m=scn.nextInt();n=scn.nextInt();
       
        while (n != 0)
        {
            res*= m;
            --n;
        }
scn.close();
        System.out.println(" the value of m^n is  " + res);
    }
}
