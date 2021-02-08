import java.util.Scanner;
import org.junit.Test;

public class freqTest {
  @Test
  public void test() {
    Scanner scn = new Scanner(System.in);
    System.out.println("enter any statment or name");
    String name = scn.nextLine();
    countFreq c2 = new countFreq();
    c2.characterCount(name);


  }
}
