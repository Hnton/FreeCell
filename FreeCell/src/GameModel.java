import java.util.ArrayList;
import java.util.Iterator;
/**
 * Game model that creates the game and has the reset method, creates the cardPiles,
 * method that moves the cards
 */
public class GameModel implements Iterable<cardPile>{

	private cardPileTableau[] tableau;
	private cardPileFoundation[] foundation;
	private cardPileFreeCell[] freeCells;
	
	private ArrayList<cardPile> allPiles; 
	
	
	/**
	 * Creates the empty cardPiles and resets them
	 */
	public GameModel()
	{
		allPiles = new ArrayList<cardPile>();
		
		freeCells = new cardPileFreeCell[4];
		tableau = new cardPileTableau[8];
		foundation = new cardPileFoundation[4];
		
		// Creating empty piles for foundation
		for(int i = 0; i < foundation.length; i++)
		{
			foundation[i] = new cardPileFoundation();
			allPiles.add(foundation[i]);
		}
		
		// Creating empty piles for foundation
		for(int i = 0; i < freeCells.length; i++)
		{
			freeCells[i] = new cardPileFreeCell();
			allPiles.add(freeCells[i]);
		}
		
		for(int i = 0; i < tableau.length; i++)
		{
			tableau[i] = new cardPileTableau();
			allPiles.add(tableau[i]);
		}
		
	reset();
	}
	
	/**
	 * Resets the game
	 */
	public void reset()
	{
		Deck deck = new Deck();
		deck.shuffle();
		
		for(cardPile pile : allPiles)
		{
			pile.clear();
		}
		
		// Dealing card into piles
		int whichPile = 0;
		for(Card card : deck)
		{
			tableau[whichPile].push(card);
			whichPile = (whichPile + 1) % tableau.length;
			
			
		}
	}

	/**
	 * Moves the card from pile to pile
	 * @param source
	 * @param destination
	 * @return
	 */
	public boolean moveCardFromPileToPile(cardPile source, cardPile destination)
	{
		boolean res = false;
		if(source.size() > 0)
		{
			Card card = source.peek();
			if(destination.rulesForAddingCard(card))
			{
				destination.push(card);
				source.pop();
				res = true;
			}
		}
	return res;
	}

	/**
	 * iterates through the piles
	 */
	@Override
	public Iterator<cardPile> iterator() 
	{
		return allPiles.iterator();
	}
	
	/**
	 * Gets the tableau Pile
	 * @param i
	 * @return
	 */
	public cardPileTableau getTableauPile(int i)
	{
		return getTableauPiles()[i];
	}
	
	/**
	 * Gets all of the tableau piles
	 * @return
	 */
	public cardPileTableau[] getTableauPiles()
	{
		return tableau;
	}
	
	/**
	 * Gets all of the freecell piles
	 * @return
	 */
	public cardPile[] getFreeCellPiles()
	{
		return freeCells;
	}
	
	/**
	 * Gets the tableau pile
	 * @param i
	 * @return
	 */
	public cardPile getFreeCellPile(int i)
	{
		return getFreeCellPiles()[i];
	}
	
	/**
	 * Gets all of the foundation piles
	 * @return
	 */
	public cardPile[] getFoundationPiles()
	{
		return foundation;
	}
	
	/**
	 * Gets the foundation pile
	 * @param i
	 * @return
	 */
	public cardPile  getFoundationPile(int i)
	{
		return getFoundationPiles()[i];
	}
}
