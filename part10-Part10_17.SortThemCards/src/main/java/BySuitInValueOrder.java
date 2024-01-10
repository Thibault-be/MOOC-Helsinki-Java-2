import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class BySuitInValueOrder implements Comparator<Card> {

  public int compare(Card cardOne, Card cardTwo){

    if (cardOne.getSuit() == cardTwo.getSuit()){
      return cardOne.getValue() - cardTwo.getValue();
    } else {
      return cardOne.getSuit().ordinal() - cardTwo.getSuit().ordinal();
    }
  }

  
  



  
}
