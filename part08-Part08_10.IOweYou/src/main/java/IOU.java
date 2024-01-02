import java.util.HashMap;

public class IOU {

  private HashMap<String, Double> money;


  public IOU(){
    this.money = new HashMap<>();
  }
  
  public void setSum(String toWhom, double amount){
    this.money.put(toWhom, amount);
  }

  public double howMuchDoIOweTo(String toWhom){
    return this.money.getOrDefault(toWhom, 0.0);
  }

}
