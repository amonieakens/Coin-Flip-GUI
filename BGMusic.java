package coinGame;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;


public class BGMusic {
   
    private String filename;
    private Player player; 
    public BGMusic(String filename) {
    	this.filename = filename;
    }


    public void play() {
    	try {
    		BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(filename));
    		player = new Player(buffer);
    		player.play();
     }
    	catch (Exception e) {System.out.println(e);}

    }
    public void close() {
    	  if (this.player != null) {
    	    this.player.close();
    	  }
    	}

 
}