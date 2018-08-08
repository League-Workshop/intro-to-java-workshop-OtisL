package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		String q1 = JOptionPane.showInputDialog("Who do you not LIKE AT ALL????????? TELL ME RIGHT NOW BECAUSE I AM A VIRUS AND I WILL DESTROY YOUR COMPUTER IF YOU DON'T!!!!!!!!");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "THIS WAS A CRUSH DETECTOR. I FOUND YOU TOTALLY HAVE A CRUSH ON "+q1);
		// 3. Ask the user for the name of their best friend
		String q2 = JOptionPane.showInputDialog("Who is your best friend? AND YOU BETTER TELL ME RIGHT NOW OR ELSE YOUR NICE SHINY IMAC WILL BE HISTORY!!!!");
		// 4. Tell them their best friend is as sweet as candy
		JOptionPane.showMessageDialog(null, "YOUR FRIEND "+q2+" IS AS SWEET AS CANDY! HAHAHAHAHA I WILL STILL DESTROY YOUR COMPUTER IF YOU DON'T STOP DOING JAVA NOWWWWWWWW!!!!!!");
	} 
}



