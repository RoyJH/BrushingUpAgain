package playingCards;

public class Play {

	public static void main(String[] args) {
		Cards card[] = new Cards[51];
		for (int i=0;i<=51;i++) {
			card[i].makeCards(i);
		}
	}
	
}
