import java.util.ArrayList;
import java.util.Collections;


public class Hand implements Comparable<Hand> {

  private ArrayList<Card> hand;

  public Hand(){
    this.hand = new ArrayList<>();
  }

  public void add(Card card){
    this.hand.add(card);
  }

  public void print(){
    this.hand.stream()
      .forEach(card -> System.out.println(card));
  }

  public void sort(){
    Collections.sort(this.hand, (cardOne, cardTwo) -> cardOne.compareTo(cardTwo));
  }

  @Override
  public int compareTo(Hand hand){

    int sumOne = this.hand.stream() 
      .map(card -> card.getValue())
      .reduce(0, (previousSum, value) -> previousSum + value);
 
      int sumTwo = hand.hand.stream() 
        .mapToInt(Card::getValue)
        .sum();

    return sumOne - sumTwo;
  }

  public void sortBySuit(){
    BySuitInValueOrder sortBySuitSorter = new BySuitInValueOrder();

    Collections.sort(this.hand, sortBySuitSorter);
  }

  
}
