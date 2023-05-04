package java2assign;
public class PlayingCards {
    public static void main(String[] args) {
        System.out.println("Playing Cards");
        Deck deck = new Deck();
        deck.create();
        
        System.out.println("Sorted cards");
        deck.sort();
        
        System.out.println("Shuffled cards");
        deck.shuffle();
        deck.showCards();
    }//main method end
    
}//main class end
