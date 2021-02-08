
import java.util.HashMap;

public class countFreq {
  public void characterCount(String inputString) {
    HashMap<Character, Integer> c1 = new HashMap<Character, Integer>();

    char[] strArray = inputString.toCharArray();

    for (char c : strArray) {
      if (c1.containsKey(c)) {
        c1.put(c, c1.get(c) + 1);
      } else {
        c1.put(c, 1);
      }
    }
    System.out.println(inputString + " : " + c1);
  }
}
