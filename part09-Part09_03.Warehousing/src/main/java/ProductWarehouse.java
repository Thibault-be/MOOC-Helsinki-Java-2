public class ProductWarehouse extends Warehouse {

  private String productName;

  //creates an empty warehouse
  public ProductWarehouse(String productName, double capacity){
    super (capacity);
    this.productName = productName;
  }

  public String getName(){
    return this.productName;
  }

  public void setName(String newName){
    this.productName = newName;
  }

  @Override
  public String toString(){
    return this.productName + ": " + super.toString() ;
  }


  
}
