package coinGame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CoinPanel extends JPanel{
	private Coin coin;
	
	private ImageIcon heads, tails;
	private JLabel imageLabel,guessLabel, isGuessRight, currentGuess, answer;
	
	//add labels to guess
	
	//Guess coin by clicking coin image buttons 
	// plays video of answer
	// Label prints saying right or wrong
	public CoinPanel(Coin coin) {
		this.coin = coin;
		heads = new ImageIcon("Head coin.png");
		tails = new ImageIcon("Tail coin.png");
		isGuessRight = new JLabel();
		currentGuess = new JLabel();
		answer = new JLabel();	
		guessLabel = new JLabel();
		imageLabel = new JLabel("Click the Coin to Guess", heads, SwingConstants.CENTER);
		imageLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		imageLabel.setVerticalTextPosition(SwingConstants.TOP);
		isGuessRight.setHorizontalTextPosition(SwingConstants.CENTER);
		isGuessRight.setVerticalTextPosition(SwingConstants.BOTTOM);
		currentGuess.setHorizontalTextPosition(SwingConstants.CENTER);
		currentGuess.setVerticalTextPosition(SwingConstants.BOTTOM);
		answer.setHorizontalTextPosition(SwingConstants.CENTER);
		answer.setVerticalTextPosition(SwingConstants.BOTTOM);
		add(imageLabel);
		add(guessLabel);
		add(isGuessRight);
		add(currentGuess);
		add(answer);
	

		

		
		setBackground(new Color(0xEADBAB));
		setPreferredSize(new Dimension (640,512));
	}


	public void HeadsRepaint() {
		if (coin != null) {
			guessLabel.setIcon(heads);
		if(coin.getCoinOutput().equals("heads")) {
			isGuessRight.setText("You Guessed Right!");
			currentGuess.setText("You Guessed Heads...");
			answer.setText("The answer is Heads.");			
			imageLabel.setIcon(heads);}
		if(coin.getCoinOutput().equals("tails")) {
			isGuessRight.setText("You Guessed Wrong!");
			currentGuess.setText("You Guessed Heads...");
			answer.setText("The answer is Tails.");		
			imageLabel.setIcon(tails);}
		
		super.repaint();
		}

	}
	public void TailsRepaint() {
		if (coin != null) {
			guessLabel.setIcon(tails);

		if(coin.getCoinOutput().equals("heads")) {
			
			isGuessRight.setText("You Guessed Wrong!");
			currentGuess.setText("You Guessed Tails...");
			answer.setText("The answer is Heads.");			
			imageLabel.setIcon(heads);}
		if(coin.getCoinOutput().equals("tails")) {
			isGuessRight.setText("You Guessed Right!");
			currentGuess.setText("You Guessed Tails...");
			answer.setText("The answer is Tails.");		
			imageLabel.setIcon(tails);}
		super.repaint();
		}

	}
	
	
	

}
