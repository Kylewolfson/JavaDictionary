
import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class WordTest {

  @Test
  public void word_initializesCorrectly_true() {
    Word testWord = new Word("Doe");
    assertEquals(true, testWord instanceof Word);
  }
  @Test
  public void word_getsDefinition_true() {
    Word testWord = new Word("Doe");
    testWord.addDefinition("A deer");
    ArrayList<Definition> testDefinitions = testWord.define();
    assertEquals("A deer", testDefinitions.get(0).getDefinition());
  }
}
