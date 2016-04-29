
import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class WordTest {

  @After
  public void tearDown() {
    Word.clear();
  }

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
  @Test
  public void word_getsSecondDefinition_true() {
    Word testWord = new Word("Doe");
    testWord.addDefinition("A deer");
    testWord.addDefinition("A female deer");
    ArrayList<Definition> testDefinitions = testWord.define();
    assertEquals("A female deer", testDefinitions.get(1).getDefinition());
  }
  @Test
  public void word_returnAll_working() {
    Word testWord = new Word("Doe");
    Word testWord2 = new Word("Buck");
    assertEquals("Buck", (Word.all()).get(1).getName());
  }
}
