package section3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String q1 = JOptionPane.showInputDialog("Hello. What is your name??????");
		JOptionPane.showMessageDialog(null, "Hello, "+ q1+". Do you remember that virus that was installed on your computer?");
				
	}
}
