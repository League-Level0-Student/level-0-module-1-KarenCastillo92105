/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

public class RobotWalkOfFame {

	public static void main(String[] args) {

		// 1. Create a Robot. Set the X position of the Robot so that it starts on the left. 
Robot r = new Robot("mini");
r.setSpeed(10);
r.setX(0);
r.penDown();


for (int j=0;j<10;j++) {
		// 2. Make the Robot draw a star shape. Hint: 144.
for (int i=0;i<5;i++) {
	r.turn(144);
r.move(50);
}
r.penUp();
r.setAngle(90);
r.move(50);
r.penDown();
}		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the Robot draw a line of stars: 
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
