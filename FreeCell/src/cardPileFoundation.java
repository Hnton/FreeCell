/*
 * 
 */
public class cardPileFoundation extends cardPile 
{
	
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
