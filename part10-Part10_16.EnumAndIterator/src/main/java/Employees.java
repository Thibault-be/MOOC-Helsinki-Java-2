import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Employees {

  private List<Person> employees;

  public Employees(){
    this.employees = new ArrayList<>();
  }
  
  public void add(Person personToAdd){
    this.employees.add(personToAdd);
  }

  public void add(List<Person> peopleToAdd){
    peopleToAdd.stream()
      .forEach(person -> this.employees.add(person));
  }

  public void print(){
    Iterator<Person> iterator = this.employees.iterator();

    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }

  public void print(Education education){
    Iterator<Person> iterator = this.employees.iterator();

    while(iterator.hasNext()){
      Person nextInline = iterator.next();
      if(education == nextInline.getEducation()){      
        System.out.println(nextInline);
      }

    }

    
  }

  public void fire(Education education){
    Iterator<Person> edLevel = this.employees.iterator();

    while (edLevel.hasNext()){

      Person dude = edLevel.next();

      if (dude.getEducation() == education){
        edLevel.remove();
      }

    }
  }

}
