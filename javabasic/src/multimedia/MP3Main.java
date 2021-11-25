package multimedia;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class MP3Main {

	public static void main(String[] args) {
        new Thread() {
            public void run() {
                try {
                	FileInputStream fileInputStream = new FileInputStream("./ttl.mp3");
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                    Player player = new Player(bufferedInputStream);
                	player.play();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }.start();

	}

}
