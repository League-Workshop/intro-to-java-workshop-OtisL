package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot problox = new Robot();
	void go() {
		// 4. Make the robot move as fast as possible
		problox.setSpeed(10000000);
		
		// 5. Set the pen width to 5
		problox.setPenWidth(5);
		//JOptionPane.showMessageDialog(null, "Pen width was set to 5");
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for(int a=0; a<4; a++) {
			// 7. Set the pen color to random
			problox.setRandomPenColor();
			//JOptionPane.showMessageDialog(null, "Pen color was set to Random");
			// 1. Call the drawSquare() method
			//JOptionPane.showMessageDialog(null, "Calling drawSquare() method");
			drawSquare();
			// 8. Turn the robot 90 degrees to the right
			problox.turn(90);
		}
	}

	
	void drawSquare() {
		//JOptionPane.showMessageDialog(null, "This is the drawSquare() method. How may I help you?");
		/* 3. Fill in the code to draw a square inside the method below. */
		for(int i=0; i<4; i++) {
			problox.penDown();
			problox.move(200);
			problox.turn(90);
		}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



