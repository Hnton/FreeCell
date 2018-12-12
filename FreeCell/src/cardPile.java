import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Cardpile for the FreeCell. Implements a ArrayList based Stack to hold the cards
 * @author Mikael Hinton & Brian Belcher
 *
 */
public class cardPile implements Iterable<Card>{ 

	// Creates a new arrayList card
	protected ArrayList<Card> card = new ArrayList<Card>();
	
	/**
	 * Adds a card to the stack
	 * @param newCard
	 */
	public void push(Card newCard)
	{
		card.add(newCard);
	}
	
	/**
	 * Returns the size of the stack
	 * @return
	 */
	public int size()
	{
		return card.size();
	}
	
	/**
	 * Removes and returns the card at the top of the stack
	 * @return
	 */
	public Card pop()
	{
		int last = size() - 1;
		Card tempCard = card.get(last);
		card.remove(last);
		return tempCard;
	}
	
	/**
	 * Shuffles the cards into random order
	 */
	public void shuffle()
	{
		Collections.shuffle(card);
	}
	
	/**
	 * Returns the card that is on the top of the stack but doesnt remove it.
	 * @return
	 */
	public Card peek()
	{
		return card.get(card.size() - 1);
	}
	
	/**
	 * Clears the stack
	 */
	public void clear()
	{
		card.clear();
	}
	
	/**
	 * Rules for adding card, overridden in other classes
	 * Not tested since it gets overridden
	 * @param card
	 * @return
	 */
	public boolean rulesForAddingCard(Card card)
	{
		return true;
	}
	
	/**
	 * Iterator to iterate through the cards
	 */
	@Override
	public Iterator<Card> iterator() 
	{
		return card.iterator();
	}
	
	/**
	 * Returns the cardPile
	 */
	public String toString()
	{
		return card.toString() + "\n";
	}
	
}
