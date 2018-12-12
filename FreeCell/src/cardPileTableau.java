/**
 * Extends the cardPile and is used for adding cards to the tableau
 * @author Mikael Hinton & Brian Belcher
 *
 */
public class cardPileTableau extends cardPile 
{

	/**
	 * Rules for adding cards to the tableau
	 */
	@Override 
	public boolean rulesForAddingCard(Card card)
	{
		if(this.size() == 0 || (this.peek().getValue().ordinal() - 1 == card.getValue().ordinal() && this.peek().getColor() != card.getColor()))
		{
			return true;
		}
	return false;
	}	
}
