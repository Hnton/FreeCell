/*
 * 
 */
public class cardPileTableau extends cardPile 
{

	@Override 
	public boolean rulesForAddingCard(Card card)
	{
		if(this.size() == 0 ||
				(this.peek().getValue().ordinal() - 1 == card.getValue().ordinal() &&
					this.peek().getColor() != card.getColor()))
		{
			return true;
		}
	return false;
	}
	
	
}
