import java.util.ArrayList;

public class OneItemBox extends Box {

  private ArrayList<Item> oneThing;  

  public OneItemBox(){
    this.oneThing = new ArrayList<>();
  }

  public void add(Item item){
    if (this.oneThing.size() == 1) return;
    this.oneThing.add(item);
  }

  public boolean isInBox(Item item){
    return this.oneThing.contains(item);
  }
  
}
