package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		 
		int s = 0;
		//Q1
		String q1 = JOptionPane.showInputDialog("Who made the game [GCR] Grand Continental Railways (no caps)");
		if (q1.equals("themodsterrb")) {
			JOptionPane.showMessageDialog(null, "Right");
			s++;
		}else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
		//Q2
		String q2 = JOptionPane.showInputDialog("Who made the subway testing series (no caps)");
		if (q2.equals("arsentic")) {
			JOptionPane.showMessageDialog(null, "Right");
			s++;
		}else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}	
		//Q3
		String q3 = JOptionPane.showInputDialog("Who is Karsten in roblox? (no caps)");
		if (q3.equals("otislrb")) {
			JOptionPane.showMessageDialog(null, "Right");
			s++;
		}else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
		JOptionPane.showMessageDialog(null, "Your final score was "+s+"/3.");
	}
}
