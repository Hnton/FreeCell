/**
 * Deck class the creates the deck with 52 cards and gives each a suit and value.
 * Then Shuffles the cards in the deck
 * @author Mikae
 *
 */
public class Deck extends cardPile
{
	// Count for how many cards in the deck
	public int count = 0; 
	
	/**
	 * Creates a new card for each card and adds all the cards into the deck
	 */
	public Deck() 
	{
		for(Suit s : Suit.values())
		{
			for(Value v : Value.values())
			{
				Card c = new Card(v, s);
				this.push(c);
				count++; 
			}
		}
	shuffle();
	}	
	
	/**
	 * Returns the size of the deck
	 */
	public int size()
	{
		return count; 
	}
	
}
