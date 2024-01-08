import java.util.List;
import java.util.ArrayList;

public class Herd implements Movable {

  private List<Movable> herd;

  public Herd(){
    this.herd = new ArrayList<>();
  }

  public void move(int dx, int dy){
    for (Movable organism : this.herd){
      organism.move(dx, dy);
    }
  }

  public void addToHerd(Movable movable){
    this.herd.add(movable);
  }

  public String toString(){
    String returnString = "";
    for (Movable organism : this.herd){
      returnString = returnString + organism.toString() + "\n";
    }
    return returnString;
  } 
}
