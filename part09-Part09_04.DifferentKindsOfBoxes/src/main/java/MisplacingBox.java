import java.util.ArrayList;

public class MisplacingBox extends Box{

  private ArrayList<Item> lostForEver;

  public MisplacingBox(){
    this.lostForEver = new ArrayList<>();
  }

  public void add(Item item){
    this.lostForEver.add(item);
  }

  public boolean isInBox(Item item){
    return false;
  }







}