/**
 * Driver class to test all methods of FreeCell. 
 * This will not be testing the Game Model, Game Rules GUI, Table GUI, Welcome GUI, Value (enum) or Suit (enum) classes. 
 * @author Mikael Hinton & Brian Belcher 
 */

public class FreeCellTestDriver
{

	public static void main(String[] args) 
	{		
		cardTest(); 				//Done 		
		cardPileTest(); 			//Done
		cardPileFoundationTest();	//Done
		cardPileFreeCellTest();		//Done 
		cardPileTableauTest();		//Done
		deckTest(); 				//Done
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
		
		System.out.println("**********End of Card Class Test**********\n");
	}
	
	/**
	 * Method used to test the cardPile class
	 */
	public static void cardPileTest()
	{
		//Test parameters
		Card crdTst1 = new Card (Value.Ace, Suit.Spades);
		Card crdTst2 = new Card (Value.Ace, Suit.Hearts);		
		Card crdTst3 = new Card (Value.Ace, Suit.Clubs);
		Card crdTst4 = new Card (Value.Ace, Suit.Diamonds);
		
		//New Object		
		cardPile crdPile = new cardPile ();		
		
		//Beginning of Stack Tests		
		System.out.println("\n************CardPile Test************");
		
		System.out.println("**************Size Test**************");
		System.out.println("Size test should return 0.\nActual result: " + crdPile.size());
		
		System.out.println("\n************Push Method Test************");
		System.out.println("2 Objects added via push method.");
		crdPile.push(crdTst1);
		crdPile.push(crdTst2);
		System.out.println("Current cards: \n" + crdPile.toString());		

		System.out.println("\n************Peek Method Test*************");
		System.out.println("Calling peek method, which will retrieve the top object, but not delete it.");
		System.out.println("Current size should return 2.\nActual result: " + crdPile.size());
		System.out.println("Peek should retrieve Ace of Hearts.\nActual result: " + crdPile.peek());
		System.out.println("Current size after peek should still return 2.\nActual result: " + crdPile.size());		
		
		System.out.println("\n************Clear Method Test************");
//		System.out.println("Current cards: \n" + crdPile.toString());
		System.out.println("Size test should still return 2.\nActual result: " + crdPile.size());
		
		System.out.println("Now calling the Clear method.");
		crdPile.clear(); 
		System.out.println("Size test should now return 0.\nActual result: " + crdPile.size());		
				
//		System.out.println("\n************Pop Method Test*************");
				
		
		System.out.println("\n************Shuffle Method Test************");		
		System.out.println("4 Objects added via push method.");
		crdPile.push(crdTst1);
		crdPile.push(crdTst2);
		crdPile.push(crdTst3);
		crdPile.push(crdTst4);
		System.out.println("Current cards: \n" + crdPile.toString());
		System.out.println("Now shuffling");
		crdPile.shuffle();
		System.out.println("Current cards after shuffle: \n" + crdPile.toString());		
		
		System.out.println("\n************Pop Method Test*************");
		System.out.println("Calling pop method, which will remove object from the stack.");
		System.out.println("Size test before pop should be 4.\nActual result: " + crdPile.size());
		crdPile.pop();				
		System.out.println("Size test after pop should be 3.\nActual result: " + crdPile.size());	
		
		System.out.println("**********End of cardPileTest Test**********\n");
	}	
		
	/*
	 * Method used to test the cardPileFoundation class 
	 */
	public static void cardPileFoundationTest() 
	{
		//Cards to test
		Card crdTst1 = new Card (Value.Ace, Suit.Spades);
		Card crdTst2 = new Card (Value.Ace, Suit.Hearts);
		Card crdTst3 = new Card (Value.Deuce, Suit.Spades);
		Card crdTst4 = new Card (Value.Three, Suit.Hearts);
		Card crdTst5 = new Card (Value.Four, Suit.Spades);
		
		//New object
		cardPileFoundation crdFnd = new cardPileFoundation();
		
		System.out.println("\n************CardPileFoundation Test************");		
		System.out.println("Test to see if we can add Four of Spades to the Foundation.\nExpected result is false.\nActual result: " + crdFnd.rulesForAddingCard(crdTst5));		
		
		System.out.println("\nTest to see if we can add Ace of Spades to the Foundation.\nExpected result is true.\nActual result: " + crdFnd.rulesForAddingCard(crdTst1));
		System.out.println("Now adding the Ace of Spades to the Foundation.");		
		crdFnd.push(crdTst1);
		System.out.println("Current cards: \n" + crdFnd.toString() + "\n");
		
		System.out.println("Test to see if we can add Ace of Hearts to the Foundation.\nExpected result is false.\nActual result: " + crdFnd.rulesForAddingCard(crdTst2));				
		System.out.println("Current cards: \n" + crdFnd.toString() + "\n");
		
		System.out.println("Test to see if we can add the Deuce of Spades to the Foundation.\nExpected result is true.\nActual result: " + crdFnd.rulesForAddingCard(crdTst3));
		System.out.println("Now adding Deuce of Spades to Foundation");
		crdFnd.push(crdTst3);
		System.out.println("Current cards: \n" + crdFnd.toString() + "\n");
		
		System.out.println("Test to see if we can add a 3 of Hearts to the Foundation.\nExpected result is false.\nActual result: " + crdFnd.rulesForAddingCard(crdTst4));
		System.out.println("Current cards: \n" + crdFnd.toString() + "\n");
		
		System.out.println("Test to see if we can add a 4 of Spades to the Foundation.\nExpected result is false.\nActual result: " + crdFnd.rulesForAddingCard(crdTst5));
		System.out.println("Current cards: \n" + crdFnd.toString());		
		
		System.out.println("**********End of CardPileFoundation Test**********\n");		 
	}
	
	/*
	 * Method used to test the cardPileFreeCell class 
	 */
	public static void cardPileFreeCellTest()
	{
		//Test cards
		Card crdTst1 = new Card (Value.Ace, Suit.Spades);
		Card crdTst2 = new Card (Value.Deuce, Suit.Spades);		
		
		//New object
		cardPileFreeCell crdPilFC = new cardPileFreeCell();
		
		System.out.println("\n************CardPileFreeCell Test************");		
		System.out.println("Test to see if we can add Ace of Spades to the Free Cell.\nExpected result is true.\nActual result: " + crdPilFC.rulesForAddingCard(crdTst1));
		System.out.println("Now adding Ace to the FreeCell");		
		crdPilFC.push(crdTst1);
		System.out.println("Current cards: \n" + crdPilFC.toString() + "\n");
		
		System.out.println("Test to see if we can add the Deuce of Spades to the FreeCell.\nExpected result is false.\nActual result: " + crdPilFC.rulesForAddingCard(crdTst2));
		System.out.println("**********End of CardPileFreeCell Test**********\n");	
	}
	
	/*
	 * Method used to test the cardPileTableau class
	 */
	public static void cardPileTableauTest()
	{
		//Cards to test
		Card crdTst1 = new Card (Value.Ten, Suit.Spades);
		Card crdTst2 = new Card (Value.Nine, Suit.Diamonds);
		Card crdTst3 = new Card (Value.Ten, Suit.Clubs);
		Card crdTst4 = new Card (Value.Jack, Suit.Hearts);
		Card crdTst5 = new Card (Value.Eight, Suit.Hearts);
		Card crdTst6 = new Card (Value.Eight, Suit.Clubs);
		
		//New object
		cardPileTableau crdPlTab = new cardPileTableau();
		
		System.out.println("\n************cardPileTableau Test************");		
		crdPlTab.rulesForAddingCard(crdTst1);		
		System.out.println("Verifying Tableau is empty: " + crdPlTab.size());		
		System.out.println("Adding ten of Spades is on the Tableau");
		crdPlTab.push(crdTst1);
		System.out.println("Current cards: \n" + crdPlTab.toString() + "\n");
		
		System.out.println("Test to see if we can add Nine of Diamonds to the Tableau.\nExpected result is true.\nActual result: " + crdPlTab.rulesForAddingCard(crdTst2));
		System.out.println("Now adding Nine of Diamonds to the Tableau");
		crdPlTab.push(crdTst2);
		System.out.println("Current cards: \n" + crdPlTab.toString() + "\n");
		
		System.out.println("Test to see if we can add the Ten of Clubs to the Tableau.\nExpected result is false.\nActual result: " + crdPlTab.rulesForAddingCard(crdTst3));
		System.out.println("Current cards: \n" + crdPlTab.toString() + "\n");
		
		System.out.println("Test to see if we can add a Jack of Hearts to the Tableau.\nExpected result is false.\nActual result: " + crdPlTab.rulesForAddingCard(crdTst4));
		System.out.println("Current cards: \n" + crdPlTab.toString() + "\n");
		
		System.out.println("Test to see if we can add a Eight of Hearts to the Tableau.\nExpected result is false.\nActual result: " + crdPlTab.rulesForAddingCard(crdTst5));		
		System.out.println("Current cards: \n" + crdPlTab.toString() + "\n");
		
		System.out.println("Test to see if we can add a Eight of Clubs to the Tableau.\nExpected result is true.\nActual result: " + crdPlTab.rulesForAddingCard(crdTst6));
		crdPlTab.push(crdTst5);
		System.out.println("Current cards: \n" + crdPlTab.toString());		
		
		System.out.println("**********End of cardPileTableau Test**********\n");		
	}
	
	/*
	 * Method used to test the deck class
	 */
	public static void deckTest()
	{
		//New object
		Deck dck = new Deck();		
		
		System.out.println("\n************Deck Test************");
//		System.out.println("Deck is: " + dck.size());
		
		System.out.println("Current cards: \n" + dck.toString() + "\n");
		
		System.out.println("Current desk size should be 52.\nActual result: " + dck.size());
		
		System.out.println("*********End of Deck Test*********\n");
	}	
}
