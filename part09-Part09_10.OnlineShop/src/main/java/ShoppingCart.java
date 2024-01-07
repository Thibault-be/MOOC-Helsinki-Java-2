import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
  
  private Map<String, Item> items;

  public ShoppingCart(){
    this.items = new HashMap<>();
  }

  public void add(String product, int price){
    if (this.items.keySet().contains(product)){
      this.items.get(product).increaseQuantity();
    } else {
      Item newItem = new Item (product, 1, price);
      this.items.put(product, newItem);
    }

    
  }

  public int price(){
    int price = 0;
    for (String product : this.items.keySet()){
      price += this.items.get(product).price();
    }
    return price;
  }

  public void print(){
    for (String product : this.items.keySet()){
      String productString = this.items.get(product).toString();
      System.out.println(productString);
    }
  }

  public void increaseQuantity(Item item){

    


  }

}
