import java.util.ArrayList;

public class Word {
private String mName;
private ArrayList<Definition> mDefinitions;


  public Word(String newWord){
    mName = newWord;
    mDefinitions = new ArrayList<Definition>();
  }

  public void addDefinition(String definition){
    Definition newDefinition = new Definition(definition);
    mDefinitions.add(newDefinition);
  }

  public ArrayList<Definition> define(){
    return mDefinitions;
  }

}
