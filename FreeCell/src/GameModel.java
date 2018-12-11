import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class GameModel implements Iterable<cardPile>{

	private cardPile[] tableau;
	private cardPile[] foundation;
	private cardPile[] freeCells;
	
	private ArrayList<cardPile> allPiles; 
	
	private Stack<cardPile> undoStack = new Stack<cardPile>();
	
	public GameModel()
	{
		allPiles = new ArrayList<cardPile>();
		
		freeCells = new cardPile[4];
		tableau = new cardPile[8];
		foundation = new cardPile[4];
		
		// Creating empty piles for foundation
		for(int i = 0; i < foundation.length; i++)
		{
			foundation[i] = new cardPileFoundation();
			allPiles.add(foundation[i]);
		}
		
		// Creating empty piles for foundation
		for(int i = 0; i < freeCells.length; i++)
		{
			freeCells[i] = new cardPileFoundation();
			allPiles.add(freeCells[i]);
		}
		
		for(int i = 0; i < tableau.length; i++)
		{
			tableau[i] = new cardPileTableau();
			allPiles.add(tableau[i]);
		}
		
	reset();
	}
	
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
				undoStack.push(source);
				undoStack.push(destination);
				res = true;
			}
		}
	return res;
	}

	@Override
	public Iterator<cardPile> iterator() 
	{
		return allPiles.iterator();
	}
	
	public cardPile getTableauPile(int i)
	{
		return (cardPile) allPiles.iterator();
	}
	
	public cardPile[] getTableauPiles()
	{
		return tableau;
	}
	
	public cardPile[] getFreeCellPiles()
	{
		return freeCells;
	}
	
	public cardPile getFreeCellPile(int i)
	{
		return freeCells[i];
	}
	
	public cardPile[] getFoundationPiles()
	{
		return foundation;
	}
	
	public cardPile  getFoundationPile(int i)
	{
		return foundation[i];
	}
	
}
