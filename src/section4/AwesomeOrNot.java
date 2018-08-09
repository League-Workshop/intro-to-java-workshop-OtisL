package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {
	
	public static void main(String[] args) {
		
		int r = new Random().nextInt(4);
		String oof = JOptionPane.showInputDialog("Type something you think is AWESOME into this box.");
		if(r==0) {
			JOptionPane.showMessageDialog(null, "You entered something AWESOME!");
		}
		if(r==1) {
			JOptionPane.showMessageDialog(null, "You entered something OK.");
		}
		if(r==2) {
			JOptionPane.showMessageDialog(null, "You entered something BORING.");
		}
		if(r==3) {
			JOptionPane.showMessageDialog(null, "This makes no sense: "+oof);
		}
	}
}



