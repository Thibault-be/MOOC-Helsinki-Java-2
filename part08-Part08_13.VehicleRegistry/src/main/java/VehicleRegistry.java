import java.util.HashMap;
import java.util.ArrayList;


public class VehicleRegistry {
  
  private HashMap<LicensePlate , String> registry;

  public VehicleRegistry(){
    this.registry = new HashMap<>();

  }

  public boolean add(LicensePlate licensePlate, String owner){
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
    ArrayList<String> owners = new ArrayList<>();
    for (String key : this.registry.values()){
      if (!owners.contains(key)){
        owners.add(key);
      }
    }
    for (String owner : owners){
      System.out.println(owner);
    }
  }
}
