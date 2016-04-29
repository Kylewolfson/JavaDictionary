import java.util.ArrayList;

public class Word {
private String mName;
private int mId;
private ArrayList<Definition> mDefinitions;
private static ArrayList<Word> dictionary = new ArrayList<Word>();


  public Word(String newWord){
    mName = newWord;
    dictionary.add(this);
    mId = dictionary.size();
    mDefinitions = new ArrayList<Definition>();
  }

  public void addDefinition(String definition){
    Definition newDefinition = new Definition(definition);
    mDefinitions.add(newDefinition);
  }

  public String getName() {
    return mName;
  }

  public ArrayList<Definition> define(){
    return mDefinitions;
  }

  public static ArrayList<Word> all(){
    return dictionary;
  }

  public static void clear(){
    dictionary.clear();
  }

  public static Word find(int index){
    return dictionary.get(index);
  }

  public int getId(){
    return (mId - 1);
  }

}
