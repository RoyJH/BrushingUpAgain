package playingCards;

public class Cards {
	int id;
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
	public void setFace(String face) {
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
	
	Cards(){}
	/*Cards(int value, char face, String name, String suit) {
		this.value = value;
		this.face = face;
		this.name = name;
		this.suit = suit;
	}*/
	public Cards makeCards() {
		while (id <= 51) {
			Cards card = new Cards();
			for (int i = 0; i <= 3; i++){//suit
				switch (i){
					case 1: card.setSuit("Spade");break;
					case 2: card.setSuit("Club");break;
					case 3: card.setSuit("Diamond");break;
					case 4: card.setSuit("Heart");break;
				}
				for (int j = 1; j <= 13; j++){
					switch (j){	
						case 1: card.setFace("Ace");break;
						case 2: card.setFace("Two");break;
						case 3: card.setFace("Three");break;
						case 4: card.setFace("Four");break;
						case 5: card.setFace("Five");break;
						case 6: card.setFace("Six");break;
						case 7: card.setFace("Sevel");break;
						case 8: card.setFace("Eight");break;
						case 9: card.setFace("Nine");break;
						case 10: card.setFace("Ten");break;
						case 11: card.setFace("Jack");break;
						case 12: card.setFace("Queen");break;
						case 13: card.setFace("King");break;
				}
				}
				//else card.value = i;
					
				
			}
		}
	}
}