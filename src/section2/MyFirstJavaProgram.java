package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot roblox = new Robot();
		for(int i=0; i<4; i++) {
			roblox.setPenColor(Color.black);
			roblox.turn(-90);
			roblox.move(100);
	}

	
	}
}
