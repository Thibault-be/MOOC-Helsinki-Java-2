import java.util.HashMap;

public class Abbreviations {

  private HashMap<String , String> abex;

  public Abbreviations(){
    this.abex = new HashMap<>();
  }

  public void addAbbreviation(String abbreviation, String explanation){
    this.abex.put(abbreviation, explanation);    
  }

  public boolean hasAbbreviation(String abbreviation){
    return this.abex.containsKey(abbreviation);
  }

  public String findExplanationFor(String abbreviation){
    return this.abex.get(abbreviation);

  }

  
}
