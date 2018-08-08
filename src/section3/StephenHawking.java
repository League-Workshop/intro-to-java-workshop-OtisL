package section3;

import javax.swing.JOptionPane;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class StephenHawking {
	
	public static void main(String[] args) {
		// 4. Use a for loop to repeat steps #2 and #3, a lot of times
		for (int i=10; i>0; i--) {
			// 2. ask the user for a sentence
			 String s = JOptionPane.showInputDialog("Give me a sentence. OR ELSE R I P YOUR IMAC IF YOU DONT GIVE ME A SENTENCE ALREADY!! You have "+i+" sentences left");
			 // 3. call the speak method below and send it the sentence
			 speak(s);
		}
	}
	

	

	
	
	
	
	
	
	
	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		 catch (Exception e) {
			 e.printStackTrace();
		 }
	}

}
