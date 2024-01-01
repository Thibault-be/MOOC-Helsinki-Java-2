import java.util.ArrayList;


public class TodoList {

  private ArrayList<String> todoos;

  public TodoList(){

    this.todoos = new ArrayList<>();
  }

  public void add(String task){
    this.todoos.add(task);
  }

  public void print(){
    int index = 1;

    for (String task : this.todoos){
      System.out.println(index + ": " + task);
      index++;
    }
  }

  public void remove(int number){
    this.todoos.remove(number-1);
  }

}
  

