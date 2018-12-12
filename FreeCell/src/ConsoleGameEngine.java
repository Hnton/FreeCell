import java.util.Scanner;

/**
 * The game engine that actually runs the game
 * @author Mikael Hinton & Brian Belcher
 *
 */
public class ConsoleGameEngine {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		GameModel game = new GameModel();
		
		System.out.println("\t\t\t\t\t\tWELCOME TO FREECELL!");
		System.out.println("\t\t\t\t\t\t++++++++++++++++++++\n");
		
		game.reset();
		
		do
		{
			
			for(int i = 0; i < game.getTableauPiles().length; i++)
			{
				System.out.println("\t\t\t\t\t\tTableau " + (i + 1));
				System.out.println("\t\t\t\t\t\t+++++++++");
				
				System.out.println(game.getTableauPile(i));
			}
			
			System.out.println("\t\t\t\t\t\tFoundations");
			System.out.println("\t\t\t\t\t\t+++++++++++");
			System.out.println("Foundation 1: " + game.getFoundationPile(0));
			System.out.println("Foundation 2: " + game.getFoundationPile(1));
			System.out.println("Foundation 3: " + game.getFoundationPile(2));
			System.out.println("Foundation 4: " + game.getFoundationPile(3));
			
			System.out.println("\t\t\t\t\t\tFreeCells");
			System.out.println("\t\t\t\t\t\t+++++++++");
			System.out.println("FreeCell 1: " + game.getFreeCellPile(0));
			System.out.println("FreeCell 2: " + game.getFreeCellPile(1));
			System.out.println("FreeCell 3: " + game.getFreeCellPile(2));
			System.out.println("FreeCell 4: " + game.getFreeCellPile(3));
			
			System.out.println("What would you like to move a card from? Tableau - 1, FreeCell - 2");
			System.out.println("Redeal - 4, Quit - 5");

			int tabNum = sc.nextInt();
			// TABLEAU
			if(tabNum == 1)
			{
				System.out.println("What column is the card in? (1 - 8)");
				int colCard = sc.nextInt();
				colCard = colCard - 1;
				System.out.println(game.getTableauPile(colCard).peek());

				if(colCard < 0 || colCard > 9)
				{
					System.out.println("Invalid input!");
					System.out.println("Enter again!");
					colCard = sc.nextInt();
				}
				System.out.println("Where would you like to move this card to? 1 - Tableau, 2 - FreeCell, 3 - Foundation");
				int whereNum = sc.nextInt();
				if(whereNum < 0 || whereNum > 4)
				{
					System.out.println("This was an invalid input!");
				}
				else if(whereNum == 1)
				{
					// MOVE CARD FROM TABLEAU TO TABLEAU
					whereNum = whereNum - 1;
					System.out.println("Which column would you like to move the card to? (1 - 8)");
					int colNum = sc.nextInt();
					colNum = colNum - 1;
					if(colNum > 0 || colNum < 9)
					{
						System.out.println(game.getTableauPile(colNum).peek());
						// move card from tableau to column 1
						game.moveCardFromPileToPile(game.getTableauPile(colCard), game.getTableauPile(colNum));
					}
					else
					{
						System.out.println("Invalid input!");
					}
				}
				else if(whereNum == 2)
				{					
					// MOVE CARD FROM TABLEAU TO FREECELL

					System.out.println("Which FreeCell would you like to move the card to? (1 - 4)");
					int cellNum = sc.nextInt();
					cellNum = cellNum - 1;
					if(cellNum > 0 || cellNum < 5)
					{
						// move card from tableau to freecell
						game.moveCardFromPileToPile(game.getTableauPile(colCard), game.getFreeCellPile(cellNum));
					}
					else
					{
						System.out.println("Invalid input!");
					}
				}
				else if(whereNum == 3)
				{
					// MOVE CARD FROM TABLEAU TO FOUNDATION
					System.out.println("Which foundation would you like to move the card to?");
					int foundNum = sc.nextInt();
					foundNum = foundNum - 1;
					if(foundNum > 0 || foundNum < 5)
					{
						// move card from tableau to foundation
						game.moveCardFromPileToPile(game.getTableauPile(colCard), game.getFoundationPile(foundNum));

					}
					else
					{
						System.out.println("Invalid input!");
					}
				}
			}
			
			// FREECELL
			else if(tabNum == 2)
			{
				System.out.println("What freecell is the card in? (1 - 4)");
				int colCard = sc.nextInt();
				colCard = colCard - 1;
				System.out.println(game.getFreeCellPile(colCard).peek());
				if(colCard < 0 || colCard > 5)
				{
					System.out.println("Invalid input!");
					System.out.println("Enter again!");
					colCard = sc.nextInt();
				}
				System.out.println("Where would you like to move this card to? 1 - Tableau, 2 - FreeCell, 3 - Foundation");
				int whereNum = sc.nextInt();
				if(whereNum < 0 || whereNum > 4)
				{
					System.out.println("This was an invalid input!");
				}
				else if(whereNum == 1)
				{
					// MOVE CARD FROM FREECELL TO TABLEAU
					whereNum = whereNum - 1;
					System.out.println("Which column would you like to move the card to? (1 - 8)");
					int colNum = sc.nextInt();
					colNum = colNum - 1;
					if(colNum > 0 || colNum < 9)
					{
						System.out.println(game.getTableauPile(colNum).peek());
						// move card from freecell to column
						game.moveCardFromPileToPile(game.getFreeCellPile(colCard), game.getTableauPile(colNum));
					}
					else
					{
						System.out.println("Invalid input!");
					}
				}
				else if(whereNum == 2)
				{					
					// MOVE CARD FROM FREECELL TO FREECELL

					System.out.println("Which FreeCell would you like to move the card to? (1 - 4)");
					int cellNum = sc.nextInt();
					cellNum = cellNum - 1;
					if(cellNum != colCard && (cellNum > 0 || cellNum < 5))
					{
						// move card from freecell to freecell
						game.moveCardFromPileToPile(game.getFreeCellPile(colCard), game.getFreeCellPile(cellNum));
					}
					else
					{
						System.out.println("Invalid input!");
					}
				}
				else if(whereNum == 3)
				{
					// MOVE CARD FROM FREECELL TO FOUNDATION
					System.out.println("Which foundation would you like to move the card to?");
					int foundNum = sc.nextInt();
					foundNum = foundNum - 1;
					if(foundNum > 0 || foundNum < 5)
					{
						// move card from freecell to foundation
						game.moveCardFromPileToPile(game.getFreeCellPile(colCard), game.getFoundationPile(foundNum));

					}
					else
					{
						System.out.println("Invalid input!");
					}
				}
			}
			else if(tabNum == 4)
			{
				System.out.println("Redealing the cards!");
				game.reset();
			}
			else if(tabNum == 5)
			{
				System.out.println("Quitting the game! Thanks for nothing!");
				return;
			}
			
			
		}while(game.getTableauPiles().length != 0);
		
		System.out.println("YOU HAVE WON!");
		
	}
}
