import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

  private HashMap<String, ArrayList<String>> storage;

  public StorageFacility(){
    this.storage = new HashMap<>();
  }

  public void add(String unit, String item){
    this.storage.putIfAbsent(unit, new ArrayList<>());
    
    ArrayList<String> items = this.storage.get(unit);
    items.add(item);

  }

  public ArrayList<String> contents(String StorageUnit){
    
    ArrayList<String> items = this.storage.getOrDefault(StorageUnit, new ArrayList<>());
    return items;
  }

  public ArrayList<String> storageUnits(){
    ArrayList<String> units = new ArrayList<>();
    for (String key : this.storage.keySet()){
      units.add(key);
    }
    return units;
  }

  public void remove(String storageUnit, String item){
    ArrayList<String> items = this.storage.get(storageUnit);

    if (! this.storage.containsKey(storageUnit)) return;

    if (items.contains(item)){
      items.remove(item);
      if (items.isEmpty()){
        this.storage.remove(storageUnit);
      }
    }
  }
}
