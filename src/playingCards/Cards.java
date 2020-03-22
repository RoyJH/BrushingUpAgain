package playingCards;

public class Cards {
	private int id =0;
	private int value;
	private String face;
	private String name;
	private String suit;
	public int assign;
	
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
	Cards(int value, String face, String name, String suit) {
		setValue(value);
		setFace(face);
		setName(name);
		setSuit(suit);
	}
	public void makeCards(int k) {
			setId(k);
			if (k<=12) 				{setSuit("Spade");}
			else if(k>=13&&k<=25) 	{setSuit("Club");}
			else if(k>=26&&k<=38) 	{setSuit("Diamond");}
			else if(k>=39) 			{setSuit("Heart");}
			if(k==0 || k==13 || k==26||k==39) {assign=1;}
			assign = k%13+1;
			pickFace(assign);
			setName(face + " of " + suit);
	}								
	public void print() {
		System.out.println("This card's name is "+this.name);
		System.out.println("This card's id is "+this.id);
		System.out.println("This card's face is "+this.face);
		System.out.println("This card's suit is "+this.suit);		
	}
	public void pickFace(int f) {
		switch (f){	
		case 1: setFace("Ace");break;
		case 2: setFace("Two");break;
		case 3: setFace("Three");break;
		case 4: setFace("Four");break;
		case 5: setFace("Five");break;
		case 6: setFace("Six");break;
		case 7: setFace("Seven");break;
		case 8: setFace("Eight");break;
		case 9: setFace("Nine");break;
		case 10: setFace("Ten");break;
		case 11: setFace("Jack");break;
		case 12: setFace("Queen");break;
		case 13: setFace("King");break;
		default : setFace("");
		}
	}
}
