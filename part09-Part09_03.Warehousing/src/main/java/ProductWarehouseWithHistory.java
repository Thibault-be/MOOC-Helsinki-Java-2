public class ProductWarehouseWithHistory extends ProductWarehouse{

  
  private ChangeHistory history;

  public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
    super (productName, capacity);
    super.addToWarehouse(initialBalance);
    
    this.history = new ChangeHistory();
    this.history.add(initialBalance);
  }

  public String history(){
    return this.history.toString();
  }
  

  public void addToWarehouse(double amount){
    super.addToWarehouse(amount);
    this.history.add(this.getBalance());
  }

  public double takeFromWarehouse(double amount){
    double returnAmount = super.takeFromWarehouse(amount);
    this.history.add(this.getBalance());
    return returnAmount;
  }

  public void printAnalysis(){
    
    double max = this.history.maxValue();
    double min = this.history.minValue();
    double avg = this.history.average();

    System.out.println(
      "Product: " + this.getName() + 
      "\nHistory: " + this.history.toString() +
      "\nLargest amount of product: " + max +
      "\nSmallest amount of product: " + min +
      "\nAverage: " + avg
    );
  }

}
