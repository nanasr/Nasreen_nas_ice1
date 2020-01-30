/* Auth: Nasreen
Student _id : 991567814
 */

public class Card {
    private String joker;
    private final Suit suit;
    private final Value value;

    public enum Suit {
        HEARTS, CLUBS, SPADES, DIAMONDS
    };

    public enum Value {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    };
    

    public String getJoker() {
        return joker;
    }

    public void setJoker(String joker) {
        this.joker = joker;
    }

    public Card(Suit s, Value gVal) {
        suit = s;
        value = gVal;
    }

    public Value getValue() {
        return this.value;
    }

    public Suit getSuit() {
        return this.suit;
    }
}
