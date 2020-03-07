package playingCards;

public class Cards {
	private int value;
	private char face;
	private String name;
	private String suit;
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public char getFace() {
		return face;
	}
	public void setFace(char face) {
		this.face = face;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	Cards(int value, char face, String name, String suit) {
		this.value = value;
		this.face = face;
		this.name = name;
		this.suit = suit;
	}
	public Cards makeCards() {
		Cards card = new Cards();
		card.getValue();
		card.getFace();
		card.getName();
		card.getSuit();
		return card;
	}
	
}
