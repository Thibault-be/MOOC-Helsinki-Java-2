import java.util.List;
import java.util.ArrayList;

public class Pipe<T> {

  private List<T> values;

  public Pipe(){
    this.values = new ArrayList<>();
  }

  public void putIntoPipe(T value){
    this.values.add(value);
  }

  public T takeFromPipe(){
    if (this.values.isEmpty()) return null;

    T returnValue = this.values.get(0);
    this.values.remove(0);
    return returnValue;
  }

  public boolean isInPipe(){
    return(!this.values.isEmpty());
  
  }
}
