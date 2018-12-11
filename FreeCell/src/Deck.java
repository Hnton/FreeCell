import java.util.*;

public class Deck extends cardPile
{

	public Deck() 
	{
		for(Suit s : Suit.values())
		{
			for(Value v : Value.values())
			{
				Card c = new Card(v, s);
				this.push(c);
			}
		}
	shuffle();
	}	

}
