package _16_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot cca=new Robot();
public static void main(String[] args) {
	
}
static void DrawSquare() {
	cca.setSpeed(100);
	cca.turn(90);
	cca.penDown();
	cca.move(150);
	cca.turn(-90);
	cca.move(150);
	cca.turn(-90);
	cca.move(150);
	cca.turn(-90);
	cca.move(150);}
static void DrawCircle() {
	cca.setSpeed(100);
	
}


}
