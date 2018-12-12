/**
 * Extends the cardPile and is used for the rules for adding cards to the freecells
 * @author Mikael Hinton & Brian Belcher
 *
 */
public class cardPileFreeCell extends cardPile {

	/**
	 * Rule for adding cards to the freecell
	 */
	@Override public boolean rulesForAddingCard(Card card)
	{
		return size() == 0;
	}
}
