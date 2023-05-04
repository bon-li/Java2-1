package java2assign;
import java.util.Arrays;

public class Deck extends Cards{
    
    public void create(){
        this.card = new Card[52];
        String[] suit = {"Ace","02", "03", "04", "05", "06", "07", "08", "09", "10", "Jack", "Queen", "King"};
        String[] rank = {"Hearts", "Diamonds", "Spades", "Clubs"};
        int index = 0;
        
        for (int i=0; i <rank.length; i++){ //populating Card array with rank and suit
            for (int j=0; j <suit.length; j++){
                card[index] = new Card(rank[i],suit[j]);
                index++;
            }//for loop end
        }//for lop end
        for (int i = 0; i < card.length; i++){
            System.out.println(card[i]);
        }//for loop end
        System.out.println(" ");
    }//create class end
    
    public void sort(){  
        String[] strcards = new String[52]; //sorting card array
        int i=0;
        for(Card c: card){ //populating sorted card array
            strcards[i] = "Card{" + "rank = " + c.rank + ", suit = " + c.suit + "}";
            i++;
        }//for loop end
        Arrays.sort(strcards);
        for (int j = 0; j< 52; j++){ //printing sorted card array
            System.out.println(strcards[j]);
        }//for loop end
        System.out.println(" ");
    }//sort class end
    
    public void shuffle() {
        for (int i = 0; i < card.length; i++) { //shuffling card array
            int shuffle = (int)(Math.random()*card.length);
            card[i] = card[shuffle];
        }//for loop end
    }//shuffle class end
    
    public void showCards(){
        for (int i = 0; i < card.length; i++){ //showing shuffled cards
            System.out.println(card[i]);
        }//for loop end
    }//showCards class end
}
