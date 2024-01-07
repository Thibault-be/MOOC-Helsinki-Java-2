import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

  private int capacity;
  private ArrayList<Item> weightedItems;

  public BoxWithMaxWeight(int capacity){
    this.capacity = capacity;
    this.weightedItems = new ArrayList<>();
  }

  @Override
  public void add(Item item){
    
    int sum = 0;
    for (Item weightedItem : weightedItems){
      sum += weightedItem.getWeight();
    }

    if ((sum + item.getWeight() <= this.capacity)){
      this.weightedItems.add(item);
    }  
    

  }

  @Override
  public boolean isInBox(Item item){
    return (weightedItems.contains(item));
  }


}
