import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class cardPile implements Iterable<Card>{ 

	private ArrayList<Card> card = new ArrayList<Card>();
	
	public void push(Card newCard)
	{
		card.add(newCard);
	}
	
	public int size()
	{
		return card.size();
	}
	
	public Card pop()
	{
		int last = size() - 1;
		Card tempCard = card.get(last);
		card.remove(last);
		return tempCard;
	}
	
	public void shuffle()
	{
		Collections.shuffle(card);
	}
	
	public Card peek()
	{
		return card.get(card.size() - 1);
	}
	
	public void clear()
	{
		card.clear();
	}
	
	/**
	 * Rules for adding card, overridden in other classes
	 * @param card
	 * @return
	 */
	public boolean rulesForAddingCard(Card card)
	{
		return true;
	}
	@Override
	public Iterator<Card> iterator() 
	{
		return card.iterator();
	}	
	
}
