import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {

  private HashMap<String, ArrayList<String>> translations;

  public DictionaryOfManyTranslations(){
    this.translations = new HashMap<>();
  }

  public void add(String word, String translation){
    this.translations.putIfAbsent(word, new ArrayList<>());
    ArrayList<String> transList = this.translations.get(word);
    if(!translation.isBlank()){
      transList.add(translation);
    }
    
  }
  
  public ArrayList<String> translate(String word){
    ArrayList<String> translations = this.translations.get(word);
    if (translations == null) {
      ArrayList<String> empty = new ArrayList<>();
      return empty;
    }
    return translations;
  }

  public void remove (String word){
    this.translations.remove(word);
  }

}



/*
public void add(String word, String translation)
adds the translation for the word and preserves the old translations.

public ArrayList<String> translate(String word) 
returns a list of the translations added for the word. 
If the word has no translations, the method should return an empty list.

public void remove(String word)
removes the word and all its translations from the dictionary.
It's probably best to add the translations to an object variable 
that is of the type HashMap<String, ArrayList<String>>
 */
