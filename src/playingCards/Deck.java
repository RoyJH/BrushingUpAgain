package playingCards;

public class Deck extends Cards{
	private static final Object[] Deck = null;

	Deck(int value, char face, String name, String suit) {
		super(value, face, name, suit);
		// TODO Auto-generated constructor stub
	}
	private int value;
	private char face;
	private String name;
	private String suit;
	private int id;
	
	public void populate() {
		Deck deck[] = new Deck[51];
		for (int i = 0; i < 52; i++) {
			if(i < 13 ) {suit = "club";}
			else if (i < 52) {suit = "spade";}
			
			Cards(value, face, name, suit);
			}System.out.println(Cards.suit);
		}

	public void shuffle() {
		
	}
	public void cut() {
		
	}
}
