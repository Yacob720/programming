/**
 * This is a class that tests the Card class.
 */
public class CardTester {
    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        Card card1 = new Card("Ace", "hearts", 1);
        Card card2 = new Card("5", "clubs", 5); 
        Card card3 = new Card("Jack", "diamonds", 11);
        Card card4 = new Card("5", "spades", 5);

        System.out.println(card3.rank());
        System.out.println(card3.suit());
        System.out.println(card3.pointValue());
        System.out.println(card3.toString());
        System.out.println();

        System.out.println(card2.rank());
        System.out.println(card2.suit());
        System.out.println(card2.pointValue());
        System.out.println(card2.toString());
        System.out.println();

        System.out.println(card1.rank());
        System.out.println(card1.suit());
        System.out.println(card1.pointValue());
        System.out.println(card1.toString());
        System.out.println();

        System.out.println(card3.matches(card1));
        System.out.println(card2.matches(card4));
    }
}
