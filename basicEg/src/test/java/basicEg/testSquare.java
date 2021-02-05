package basicEg;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testSquare {
  @Test
  public void test() {
    Sqare s1 = new Sqare();
    int expected = 4;
    int actual = s1.fun(2);
    assertEquals(expected, actual);
    System.out.println(actual);

  }
}
