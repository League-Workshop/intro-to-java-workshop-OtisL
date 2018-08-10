package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	public static void main(String[] args) {
		ImageIcon dragon = new ImageIcon("src/section4/mod.jpg");
		JOptionPane.showMessageDialog(null, "Defeat TheModsterRB to take his game!", "Mod Fighter", 0, dragon);
		
		//My main integers
		int playerHealth = 100;
		int dragonHealth = 100;
		int dragonDamage = 0;
		int playerDamage = 0;
		
		while (playerHealth > 0 && dragonHealth > 0) { 
			String attack = JOptionPane.showInputDialog("Type 'attack' to attack!!");
			if (attack.equals("yell")) {
				int r1 = new Random().nextInt(25);
				dragonDamage = r1;
				dragonHealth -= r1;
			}
			if (attack.equals("attack")) {
				int r2 = new Random().nextInt(35);
				dragonDamage = r2;
				dragonHealth -= r2;
			}
			int r3 = new Random().nextInt(35);
			playerDamage = r3;
			playerHealth -= r3;
			if (playerHealth <= 0) {
				JOptionPane.showMessageDialog(null, "You were defeated by TheModsterRB! How embarrasing.");
				JOptionPane.showMessageDialog(null, "Your Health: "+playerHealth+"\n"
						+ "Mod's Health: "+dragonHealth+"\n"
						+ "Damage Mod took: "+dragonDamage+"\n"
						+ "Damage you took: "+playerDamage+"\n"
						+ "Click OK to exit");
			}else if (dragonHealth <= 0){
				JOptionPane.showMessageDialog(null, "YOU WIN!!!!!!");
				JOptionPane.showMessageDialog(null, "Your Health: "+playerHealth+"\n"
						+ "Mod's Health: "+dragonHealth+"\n"
						+ "Damage Mod took: "+dragonDamage+"\n"
						+ "Damage you took: "+playerDamage+"\n"
						+ "Click OK to exit");
			}else {
				JOptionPane.showMessageDialog(null, "Your Health: "+playerHealth+"\n"
				+ "Mod's Health: "+dragonHealth+"\n"
				+ "Damage Mod took: "+dragonDamage+"\n"
				+ "Damage you took: "+playerDamage+"\n"
				+ "Click OK to resume");
			}
		}
	}
}
