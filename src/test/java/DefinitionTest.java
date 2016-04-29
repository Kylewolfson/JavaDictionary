import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void definition_initializesCorrectly_true() {
    Definition testDefinition = new Definition("A deer");
    assertEquals(true, testDefinition instanceof Definition);
  }
}
