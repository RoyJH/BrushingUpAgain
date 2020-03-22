package playingCards;
public class Play {
	public static void main(String[] args) {
		Cards card[] = new Cards[52];
		for (int i=0; i<=51; i++) {
			card[i] = new Cards();
		}
		for (int j=0;j<=51;j++) {
			card[j].makeCards(j);
			card[j].print();
		}
	}
}
