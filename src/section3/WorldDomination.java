package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		int i = JOptionPane.showOptionDialog(null, "Do you know how to write code?", "A RANDOM QUESTION", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION, null, null, null);
		//JOptionPane.showOptionDialog(parentComponent, message, title, optionType, messageType, icon, options, initialValue)
		System.out.println(i);
		// 2. If they say "yes", tell them they will rule the world.
		if (i==0) {
			JOptionPane.showMessageDialog(null, "You will rule the world! NO WAIT. THIS VIRUS WILL RULE THE WORLD NO MATTER WHAT!! MWAHAHAHAHAHAAH!");
		}else {
			JOptionPane.showMessageDialog(null, "SINCE YOU WILL BE WASHING DISHES, I, THE VIRUS, WILL RULE THE WORLD!!!! LOLOLOLOLOLOL ;)");
		}
		// 3. Otherwise, wish them good luck washing dishes.
		
	}
	
}

