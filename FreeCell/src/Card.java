/**
 * Card class to initialize a card for the deck
 * @author Mikael Hinton & Brian Belcher
 *
 */
public class Card 
{
	
	private int valueNum;	// Value of card
	private Value value;	// Rank enum
	private Suit suit;	// Suit enum
	private String color; // SuitColor enum
//	private boolean visible = true; // Used to show or hide the first card dealt
	
	/**
	 * Constructor
	 */
	public Card(Value v, Suit s) 
	{
		value = v;
		suit = s;
	}	
	
	/**
	 * returns the value in int form
	 * @return
	 */
	protected int getValueNum()
	{
		if(getValue() == Value.Ace)
		{
			valueNum = 1;
		}
		if(getValue() == Value.Deuce)
		{
			valueNum = 2;
		}
		if(getValue() == Value.Three)
		{
			valueNum = 3;
		}
		if(getValue() == Value.Four)
		{
			valueNum = 4;
		}
		if(getValue() == Value.Five)
		{
			valueNum = 5;
		}
		if(getValue() == Value.Six)
		{
			valueNum = 6;
		}
		if(getValue() == Value.Seven)
		{
			valueNum = 7;
		}
		if(getValue() == Value.Eight)
		{
			valueNum = 8;
		}
		if(getValue() == Value.Nine)
		{
			valueNum = 9;
		}
		if(getValue() == Value.Ten)
		{
			valueNum = 10;
		}
		if(getValue() == Value.Jack)
		{
			valueNum = 11;
		}
		if(getValue() == Value.Queen)
		{
			valueNum = 12;
		}
		if(getValue() == Value.King)
		{
			valueNum = 13;
		}
		return valueNum;
	}
	
	/**
	 * Returns the value of the card
	 * @return
	 */
	protected Value getValue()
	{
		return value;
	}// End of getCard
	
	/**
	 * Returns the suit of the card
	 * @return
	 */
	protected Suit getSuit()
	{
		return suit;
	}
	
	protected String getColor()
	{
		if(suit == Suit.Spades || suit == Suit.Clubs)
		{
			color = "Black";
		}
		else
		{
			color = "Red";
		}
	return color;
	}
	
	/**
	 * To string method
	 */
	public String toString()
	{
//		if(visible == false)
//		{
//			return "Bicycle";
//		}
//		else
		{
		return value + " of " + suit;
		}
	}// End of toString
}//EOF

