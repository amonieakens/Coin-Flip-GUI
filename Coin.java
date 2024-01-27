package coinGame;

import java.util.Scanner;

public class Coin {
	private String coinOutput = "";
	public Coin() {}
	public String getCoinOutput() {return coinOutput;}
	public void setCoinOutput(String c) {coinOutput = c;}
	public void flip() {
		int flipResult = (int)(Math.random()*2 );
		if(flipResult == 0) {
			coinOutput = "heads";
		}
		else {
			coinOutput = "tails";
		}
	}

	public String toString() {return getCoinOutput();}
	
	
/*
		public  void coinGame() {
			Scanner input = new Scanner(System.in);
			String coinGuess;
			System.out.println("Guess the coin flip");
			System.out.println("Enter '0' for heads or '1' for tails");
			int guess = input.nextInt();
			while (guess < 0 || guess > 1)
			{
				System.out.println("Invalid input!");
				System.out.println("Guess the coin flip");
				System.out.println("Enter '0' for heads or '1' for tails");
				guess = input.nextInt();
				if (guess == 0 || guess == 1)
					break;
			}
		    if (guess == coin) {
				flip();
		    	System.out.println("You guessed correct!");
		    }
		    else {
				flip();
		    	System.out.println("Your guess is incorect");
		    }
		    if(guess == 0) {
				coinGuess = "heads";
			}
			else {
				coinGuess = "tails";
			}
	    	System.out.println("You guessed: " + coinGuess);
		    System.out.println("The Coin is " + coinOutput);   
		}

		
		public void main(String[] args) {
			 Boolean playAgain = true;
			 Scanner input = new Scanner(System.in);
			 do {
				
				 coinGame();
				 System.out.println("Do you wish to play again? Y/N");
				 String answer = input.nextLine();
				 playAgain = answer.equalsIgnoreCase("y");
			   } while(playAgain);
			 System.out.println("Thanks for playing");
		}
*/
}
