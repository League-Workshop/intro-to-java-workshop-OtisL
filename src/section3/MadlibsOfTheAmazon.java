package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {

	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to
		// do it...
		JOptionPane.showMessageDialog(null,"If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String a = JOptionPane.showInputDialog("Give me an adjective. OR ELSE R I P YOUR IMAC. MUWAHAHAHAHAHAH");
		// Get the user to enter a type of liquid
		String l = JOptionPane.showInputDialog("Give me a type of liquid. OR ELSE R I P YOUR IMAC. MUWAHAHAHAHAHAH");
		// Get the user to enter a body part
		String bp = JOptionPane.showInputDialog("Give me a body part. OR ELSE R I P YOUR IMAC. MUWAHAHAHAHAHAH");
		// Get the user to enter a verb
		String v = JOptionPane.showInputDialog("Give me a verb. OR ELSE R I P YOUR IMAC. MUWAHAHAHAHAHAH");
		// Get the user to enter a place
		String p = JOptionPane.showInputDialog("Give me a place. OR ELSE R I P YOUR IMAC. MUWAHAHAHAHAHAH");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		String done = "Piranhas are more "+a+" during the day, so cross the river at\n" + 
				"night. Piranhas are attracted to fresh "+l+" and will most\n" + 
				"likely take a bite out of your "+bp+" if you "+v+". Whatever\n" + 
				"you do, if you have an open wound, try to find another way to get\n" + 
				"back to the "+p+". Good luck!";
		// Make a pop-up for the final story. You can use \n to go to the next line
		JOptionPane.showMessageDialog(null, done);
	}
}
