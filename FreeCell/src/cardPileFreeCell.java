
public class cardPileFreeCell extends cardPile {

	@Override public boolean rulesForAddingCard(Card card)
	{
		return size() == 0;
	}
}
