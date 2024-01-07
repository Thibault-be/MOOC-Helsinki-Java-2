import java.util.ArrayList;

public class Box implements Packable {

  private double capacity;
  private ArrayList<Packable> content;


  public Box(double capacity){
    this.capacity = capacity;
    this.content = new ArrayList<>();
  }

  public double weight(){
    double weight = 0;

    for (Packable item : content){
      weight += item.weight();
    }
    
    return weight;
  }

  public void add(Packable item){
    
    double totalWeight = 0.0;
    for (Packable thing : this.content){
      totalWeight += thing.weight();
    }

    if (totalWeight + item.weight() <= this.capacity){
      this.content.add(item);
    }   
  }

  @Override
  public String toString(){
    return "Box: " + this.content.size() + " items, total weight " + this.weight() + " kg";
  }

  
}
