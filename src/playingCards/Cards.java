package playingCards;

public class Cards {
	private int id =0;
	//int lp;
	private int value;
	private String face;
	private String name;
	private String suit;
	//Cards card[];
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getFace() {
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	Cards(){}
	/*Cards(int value, char face, String name, String suit) {
		this.value = value;
		this.face = face;
		this.name = name;
		this.suit = suit;
	}*/
	public void makeCards(int k) {
		//int id = 0;
		//while (id <= 51) {
		//for (int k=0; k<=51; k++) {
			Cards card[] = new Cards[51];
			card[k].setId(k);
			for (int i = 1; i <= 4; i++){//suit
				switch (i){
					case 1: 
						card[k].setSuit("Spade");
						break;
					case 2:
						card[k].setSuit("Club");
						break;
					case 3:
						card[k].setSuit("Diamond");
						break;
					case 4:
						card[k].setSuit("Heart");
						break;
				}
				for (int j = 1; j <= 13; j++){
					switch (j){	
						case 1: card[k].setFace("Ace");break;
						case 2: card[k].setFace("Two");break;
						case 3: card[k].setFace("Three");break;
						case 4: card[k].setFace("Four");break;
						case 5: card[k].setFace("Five");break;
						case 6: card[k].setFace("Six");break;
						case 7: card[k].setFace("Sevel");break;
						case 8: card[k].setFace("Eight");break;
						case 9: card[k].setFace("Nine");break;
						case 10: card[k].setFace("Ten");break;
						case 11: card[k].setFace("Jack");break;
						case 12: card[k].setFace("Queen");break;
						case 13: card[k].setFace("King");break;
				}
				}
				//else card.value = i;
					
				
			}
			card[k].setName(card[k].face + " of " + card[k].suit); 
			System.out.println(card[k].name);
			System.out.println(card[k].id);
			System.out.println(card[k].face);
			System.out.println(card[k].suit);
			//id++;//return card;
		}
		//return card[k];
		//return null;
	}
//}