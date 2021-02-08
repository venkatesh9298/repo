import org.junit.Test;


public class AnagramTest {
  @Test
  public void test() {
    String[] words = {"rat", "is", "tar", "and", "goes", "soeg", "paris", "pairs"};
    Anagrams a1 = new Anagrams();
    a1.groupAnagrams(words);
  }
}
