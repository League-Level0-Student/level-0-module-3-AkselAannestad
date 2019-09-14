package _16_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot cca=new Robot();
public static void main(String[] args) {
	String two=JOptionPane.showInputDialog("Do you want a red, blue, or green shape?");
	if (two.contentEquals("red")) {cca.setPenColor(255,0,0);}
    else if (two.contentEquals("blue")) {cca.setPenColor(0,0,255);}
    else if (two.contentEquals("green")) {cca.setPenColor(0,255,0);}
	
	String one=JOptionPane.showInputDialog("Do you want a circle, a square, or a triangle?");
	if (one.contentEquals("circle")) {DrawCircle();}
	else if (one.contentEquals("square")) {DrawSquare();}
	else if (one.contentEquals("triangle")) {DrawTriangle();}
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
	cca.setSpeed(99999999);
	cca.penDown();
	for (int i = 0; i < 360; i++) {
		cca.turn(1); cca.move(1);}}
static void DrawTriangle() {
	cca.setSpeed(999999);
	cca.penDown();
	cca.turn(120);
cca.move(300);
cca.turn(120);
cca.move(300);
cca.turn(120);
cca.move(300);}
}
