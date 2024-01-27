package coinGame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CoinControl extends JPanel {
	private Coin coin;
	private CoinPanel coinPanel;
	private ImageIcon heads, tails;
	private JButton HeadGuess, TailGuess;
	public CoinControl (CoinPanel coinPanel, Coin coin) {
		this.coinPanel = coinPanel;
		this.coin = coin;
		heads = new ImageIcon("Head coin.png");
		tails = new ImageIcon("Tail coin.png");	
		HeadGuess = new JButton(heads);
		TailGuess = new JButton(tails);
		HeadGuess.setToolTipText("Guess heads");
		TailGuess.setToolTipText("Guess tails");

		HeadGuess.addActionListener(new headButtonListener());
		TailGuess.addActionListener(new tailButtonListener());
		add(HeadGuess);
		add(TailGuess);
	}
	private class headButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
		coin.flip();
		coinPanel.HeadsRepaint();
	}
  }
	private class tailButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
		coin.flip();
		coinPanel.TailsRepaint();
	}
  }

}
