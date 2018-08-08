package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		
		String w = "howe";
		speak(w);
		
		String a = JOptionPane.showInputDialog("Speel me that word OR ELSE YOUR I MAC IS HISTORY!!!!! (no caps plz)");
		
		if(a.equals(w)) {
			speak("Correct");
			JOptionPane.showMessageDialog(null, "You got me :( no more virus");
			JOptionPane.showMessageDialog(null, "Virus was deleted");
		}else {
			speak("Wrong");
			JOptionPane.showMessageDialog(null, "YOU MESSED UP!!! THIS VIRUS WILL DESTROY THIS COMPUTER NOW!!!!!");
		}
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


