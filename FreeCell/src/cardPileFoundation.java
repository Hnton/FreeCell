/**
 * Extends the cardPile and is used for the rules for adding and removing cards to the foundation
 * @author Mikael Hinton & Brian Belcher
 *
 */
public class cardPileFoundation extends cardPile 
{
	
	/**
	 * Rules for adding a card to the foundation
	 */
	@Override 
	public boolean rulesForAddingCard(Card card)
	{
		if((this.size() == 0) && (card.getValue() == Value.Ace))
		{
			return true;
		}
		
		if(size() > 0)
		{
			Card top = peek();
			if((top.getSuit() == card.getSuit() && top.getValue().ordinal() + 1 == card.getValue().ordinal()))
			{
				return true;
			}
		}
	return false;
	}

}
