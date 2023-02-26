import java.util.ArrayList;
import java.util.List;

public class ManegerBook {
	List<Card> cards = new ArrayList<Card>();

	public ManegerBook() {
		
	}
	
	//them card
	public void addCard(Card card) {
		this.cards.add(card);
		
	}
	
	//xoa theo phieu muon
	public boolean delCard(String id) {
		Card card = this.cards.stream().filter(c->c.getId().equals(id)).findFirst().orElse(null);
		if(card == null) {
			return false;
			
		}else {
			this.cards.remove(card);
			return true;
			
		}
	}
	
	//hien thi thong tin cac the muon
	public void show() {
		this.cards.stream().forEach(c->System.out.println(c.toString()));
	}
}
