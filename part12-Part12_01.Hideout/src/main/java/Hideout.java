import java.util.List;
import java.util.ArrayList;

public class Hideout <T> {

  private List<T> values;



  public Hideout(){
    this.values = new ArrayList<>();

  }

  public void putIntoHideout(T toHide){

    if (this.values.isEmpty()) {
      this.values.add(toHide);
    }else if (this.values.get(0) != toHide){
      this.values.remove(0);
      this.values.add(toHide);
    } 
  }

  public T takeFromHideout(){
    if (this.values.size() == 0) return null;

    T thing = this.values.get(0);
    this.values.remove(0);
    return thing;
  }

  public boolean isInHideout(){
    if (this.values.size() == 0) return false;

    return true;
  }

}


/*
 * public T takeFromHideout() takes out the object with a type in accordance with the type parameter given to the the class from the hideout. 
 * In case there is nothing in the hideout, we return null. Calling the method returns the object in the hideout and removes the object from 
 * the hideout.
public boolean isInHideout() returns the value true if there is an object in the hideout. 
In case there isn't an object in the hideout, it should return the value false.
 */