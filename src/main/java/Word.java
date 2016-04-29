import java.util.ArrayList;

public class Word {
private String mName;
private ArrayList<Definition> mDefinitions;


  public Word(String newWord){
    mName = newWord;
    mDefinitions = new ArrayList<Definition>();
  }

}
