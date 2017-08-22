import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ShinyObjects {

	public static void main(String[] args) {

		// 2. Ask the user how many shiny objects they want

		// 3. Play the sound that many times

		// 1. Call the method below


	}

	public static void playMisterZee() {
    	try {
   		 File soundFile = new File("/Users/League/Google Drive/league-sounds/shiny-objects.wav");
   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(3400);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}

}
