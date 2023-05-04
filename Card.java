package java2assign;
public class Card {
    String suit;
    String rank;
    
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }//card object end

    @Override
    public String toString() {
        return "Card{" + "rank = " + rank + ", suit = " + suit + '}';
    }//toString method end

    
}//main class end
