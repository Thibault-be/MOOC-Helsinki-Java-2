import java.util.HashMap;
import java.util.ArrayList;


public class VehicleRegistry {
  
  private HashMap<LicensePlate , String> registry;

  public VehicleRegistry(){
    this.registry = new HashMap<>();

  }

  public boolean add(LicensePlate licensePlate, String owner){
    //assigns the owner it received as a parameter to a car that corresponds to the license plate received as a parameter. 
    //If the license plate doesn't have an owner, the method returns true.
    //If the license already has an owner attached, the method returns false and does nothing.
    
    if (this.registry.get(licensePlate) == null){
      this.registry.put(licensePlate, owner);
      return true;
    }
    return false; 
  }

  public String get(LicensePlate licensePlate){
    if (this.registry.get(licensePlate) == null) return null;
    return this.registry.get(licensePlate);
  }

  public boolean remove (LicensePlate licensePlate){
    if (this.registry.get(licensePlate) == null) return false;

    this.registry.remove(licensePlate);
    return true;
  }

  public void printLicensePlates(){
    for (LicensePlate plate : this.registry.keySet()){
      System.out.println(plate.toString());
    }
  }

  public void printOwners(){ 
    //prints the owners of the cars in the registry.
    //Each name should only be printed once, even if a particular person owns more than one car.
    ArrayList<String> owners = new ArrayList<>();
    int count = 0;
    for (String key : this.registry.values()){
      if (!owners.contains(key)){
        owners.add(key);
      }
    }
    System.out.println(count);
    for (String owner : owners){
      System.out.println(owner);
    }
  }
}
