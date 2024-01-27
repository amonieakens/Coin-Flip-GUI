package coinGame;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameFrame extends JFrame implements ActionListener{
	JButton Start;
	JLabel label;
	BGMusic mp3 = new BGMusic("Jet Setter - Sarah, The Illstrumentalist.mp3");
	GameFrame(){
		label = new JLabel();
		label.setBounds(150, 250, 150, 150);
		label.setVisible(false);
		Start = new JButton();
		Start.setBounds(175, 175, 250, 100);
		Start.addActionListener(this);
		Start.setText("Start!");	
		Start.setFocusable(false);
		Start.setHorizontalTextPosition(JButton.CENTER);
		Start.setVerticalTextPosition(JButton.BOTTOM);
		Start.setIconTextGap(-15);
		Start.setForeground(Color.BLACK);
		Start.setBackground(Color.lightGray);
		Start.setBorder(BorderFactory.createEtchedBorder());	
		this.setTitle("Coin Game: Honors Edition");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon appLogo = new ImageIcon("Head coin.png");
		this.setIconImage(appLogo.getImage());
		this.setSize(640,512);
		this.setVisible(true);
		this.getContentPane().setBackground(new Color(0xEADBAB));
		this.add(Start);
		this.add(label);
		this.add(mp3);
	}
	private void add(BGMusic mp3) {
		mp3.play();			
		}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Start) {
			Start.setEnabled(false);
			Start.setVisible(false);
			
			Coin coin= new Coin();
			CoinPanel coinPanel = new CoinPanel(coin);
			CoinControl controls = new CoinControl (coinPanel, coin);
			
			JPanel panel = new JPanel();
			panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
			panel.add(coinPanel);
			panel.add(controls);

			GameFrame.this.getContentPane().add(panel);
			GameFrame.this.pack();
			GameFrame.this.setVisible(true);


		}	
	}

}


