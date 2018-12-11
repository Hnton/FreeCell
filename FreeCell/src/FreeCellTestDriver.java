/**
 * Driver class to test all methods of FreeCell. 
 * This will not be testing the Game Model, Game Rules GUI, Table GUI, Welcome GUI, Value (enum) or Suit (enum) classes. 
 * @author Mikael Hinton & Brian Belcher 
 */

public class FreeCellTestDriver
{

	public static void main(String[] args) 
	{		
//		cardTest(); 				//Done 		
//		cardPileTest(); 			//Mostly done
//		cardPileFoundationTest();	//???
//		cardPileFreeCellTest(); 
//		cardPileTableauTest();
		deckTest(); 
	}
	
	/**
	 * Method used to test the Card Class
	 */
	public static void cardTest()
	{
		//New objects
		Card crdTst1 = new Card (Value.Ace, Suit.Spades);
		Card crdTst2 = new Card (Value.Deuce, Suit.Hearts);
		Card crdTst3 = new Card (Value.Three, Suit.Clubs);
		Card crdTst4 = new Card (Value.Four, Suit.Diamonds);
		Card crdTst5 = new Card (Value.Five, Suit.Spades);
		Card crdTst6 = new Card (Value.Six, Suit.Hearts);
		Card crdTst7 = new Card (Value.Seven, Suit.Clubs);
		Card crdTst8 = new Card (Value.Eight, Suit.Diamonds);
		Card crdTst9 = new Card (Value.Nine, Suit.Spades);
		Card crdTst10 = new Card (Value.Ten, Suit.Hearts);
		Card crdTst11 = new Card (Value.Jack, Suit.Clubs);
		Card crdTst12 = new Card (Value.Queen, Suit.Diamonds);
		Card crdTst13 = new Card (Value.King, Suit.Spades);
		
		System.out.println("\n***********Cards created************");
		System.out.println("Card 1 should be Ace of Spades.\nActual Card is: " + crdTst1);
		System.out.println("\nCard 2 should be Deuce of Hearts.\nActual Card is: " + crdTst2);
		System.out.println("\nCard 7 should be Seven of Clubs.\nActual Card is: " + crdTst7);
		System.out.println("\nCard 1 should be Jack of Diamonds.\nActual Card is: " + crdTst11);
				
		System.out.println("\n***********getValueNum test************");
		System.out.println("ValueNum of Card 1 should be 1.\nActual result: " + crdTst1.getValueNum()); 
		System.out.println("\nValueNum of Card 2 should be 2.\nActual result: " + crdTst2.getValueNum());
		System.out.println("\nValueNum of Card 3 should be 3.\nActual result: " + crdTst3.getValueNum());
		System.out.println("\nValueNum of Card 4 should be 4.\nActual result: " + crdTst4.getValueNum());
		System.out.println("\nValueNum of Card 5 should be 5.\nActual result: " + crdTst5.getValueNum());
		System.out.println("\nValueNum of Card 6 should be 6.\nActual result: " + crdTst6.getValueNum());
		System.out.println("\nValueNum of Card 7 should be 7.\nActual result: " + crdTst7.getValueNum());
		System.out.println("\nValueNum of Card 8 should be 8.\nActual result: " + crdTst8.getValueNum());
		System.out.println("\nValueNum of Card 9 should be 9.\nActual result: " + crdTst9.getValueNum());
		System.out.println("\nValueNum of Card 10 should be 10.\nActual result: " + crdTst10.getValueNum());
		System.out.println("\nValueNum of Card 11 should be 11.\nActual result: " + crdTst11.getValueNum());
		System.out.println("\nValueNum of Card 12 should be 12.\nActual result: " + crdTst12.getValueNum());
		System.out.println("\nValueNum of Card 13 should be 13.\nActual result: " + crdTst13.getValueNum());
		
		System.out.println("\n**************getValue test***************");
		System.out.println("Value of Card 1 should be Ace.\nActual result: " + crdTst1.getValue()); 
		System.out.println("\nValue of Card 2 should be Deuce.\nActual result: " + crdTst2.getValue());
		System.out.println("\nValue of Card 7 should be Seven.\nActual result: " + crdTst7.getValue());
		System.out.println("\nValue of Card 12 should be Queen.\nActual result: " + crdTst12.getValue());
		
		System.out.println("\n**************getSuit test***************");
		System.out.println("Suit of Card 1 should be Spades.\nActual result: " + crdTst1.getSuit()); 
		System.out.println("\nSuit of Card 2 should be Hearts.\nActual result: " + crdTst2.getSuit());
		System.out.println("\nSuit of Card 7 should be Clubs.\nActual result: " + crdTst7.getSuit());
		System.out.println("\nSuit of Card 12 should be Diamonds.\nActual result: " + crdTst12.getSuit());
		
		System.out.println("\n**************getColor test***************");
		System.out.println("Color of Card 1 should be Black.\nActual result: " + crdTst1.getColor()); 
		System.out.println("\nColor of Card 2 should be Red.\nActual result: " + crdTst2.getColor());
		System.out.println("\nColor of Card 7 should be Black.\nActual result: " + crdTst7.getColor());
		System.out.println("\nColor of Card 12 should be Red.\nActual result: " + crdTst12.getColor());
	}
	
	/**
	 * Method used to test the cardPile class
	 */
	public static void cardPileTest()
	{
		//Test parameters*********************************Needs work************************
		Card crd1 = null;
		Card crd2 = null;
		
		//New Object		
		cardPile crdPile = new cardPile ();		
		
		//Beginning of Stack Tests		
		System.out.println("\n***********New Stack created************");
		
		System.out.println("\n**************Size Test**************");
		System.out.println("Size test should return 0.\nActual result: " + crdPile.size());
		
		System.out.println("\n************Push Method Test************");
		System.out.println("Object added via push method.");
		crdPile.push(crd1);
		System.out.println("Size test should now return 1.\nActual result: " + crdPile.size());	
		
//******Need to very object type and value*****************************
		System.out.println("\n************Peek Method Test*************");
		System.out.println("Calling peek method, which will retrieve the top object, but not delete it.");		 
//		try 
//		{
			
//*****************Need to be able to print items and shuffle to verify functionality		
		
			System.out.println("Peek should retrieve crd1.\nActual result: " + crdPile.peek());
//		}
//		catch (StackException e) //Test will skip this catch 
//		{
//			e.printStackTrace();
//		}
		System.out.println("\nSize test should now return 1.\nActual result: " + crdPile.size());
		
		System.out.println("\n************Pop Method Test*************");
		System.out.println("Calling pop method, which will retrieve and remove object from the stack.");
//		try 
//		{
			crdPile.pop();
//		} 
//		catch (StackException e) //Test will skip this catch 
//		{		
//			e.printStackTrace();
//		}		
		System.out.println("Size test should now return 0.\nActual result: " + crdPile.size());		
				
		
		System.out.println("\n************Clear Method Test************");
		System.out.println("2 Objects added via push method.");
		crdPile.push(crd1);
		crdPile.push(crd2);
		System.out.println("Size test should now return 2.\nActual result: " + crdPile.size());
		
		System.out.println("Now calling the Clear method.");
		crdPile.clear(); 
		System.out.println("Size test should now return 0.\nActual result: " + crdPile.size());		
		
		//Don't know how this one works
//		rulesForAddingCard(crdPile);
		
		//Don't know how to test this either
//		iterator(); 		
				
	}	
		
	/*
	 * Method used to test the cardPileFoundation class 
	 */
	public static void cardPileFoundationTest() 
	{
		cardPileFoundation crdFnd = new cardPileFoundation();
				
		Card crdFndTst1 = new Card (Value.Ace, Suit.Spades);
				
		//Not sure what to do with this. 
//		System.out.println("print is: " + rulesForAddingCard(crdFndTst1)); 
	}
	
	/*
	 * Method used to test the cardPileFreeCell class 
	 */
	public static void cardPileFreeCellTest()
	{
		//Not sure how to test this
	}
	
	/*
	 * Method used to test the cardPileTableau class
	 */
	public static void cardPileTableauTest()
	{
		//Not sure how to test this
	}
	
	/*
	 * Method used to test the deck class
	 */
	public static void deckTest()
	{
		Deck dck = new Deck();		
		
		System.out.println("Deck is: " + dck.size()); 
				
		
	}
	
}
