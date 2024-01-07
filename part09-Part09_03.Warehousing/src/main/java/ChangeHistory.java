import java.util.ArrayList;

public class ChangeHistory {

  private ArrayList<Double> logs;

  public ChangeHistory(){
    this.logs = new ArrayList<>();
  }
  
  public void add(double status){
    this.logs.add(status);
  }

  public void printsmth(){
    System.out.println("printing something in changehisroty calss");
  }

  public void clear(){
    this.logs.clear();
  }

  public String toString(){
    return this.logs.toString();
  }


  public double maxValue(){
    if (this.logs.size() == 0) return 0.0;
    double max = this.logs.get(0);
    for (double log : this.logs){
      if (log > max){
        max = log;
      }
    }
    return max;
  }

  public double minValue(){
    if (this.logs.size() == 0) return 0.0;
    double min = this.logs.get(0);
    for (double log : this.logs){
      if (log < min){
        min = log;
      }
    }
    return min;
  }

  public double average(){
    if (this.logs.size() == 0) return 0.0;
    double sum = 0.0;
    int count = 0;
    for (double log : this.logs){
      count++;
      sum += log;
    }
    return sum / count;
  }
}
