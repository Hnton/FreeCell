import java.util.*;

public class Deck extends cardPile
{
	public int count = 0; 
	
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
	
	public int size()
	{
		return count; 
	}
	
}
