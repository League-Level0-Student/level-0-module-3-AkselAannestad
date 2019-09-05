package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreUHappy {
public static void main(String[] args) {
	String one=JOptionPane.showInputDialog("Are you happy? (yes or no)");
	String two = null; 
	if (one.equals("no")) {two=JOptionPane.showInputDialog("Do you want to be happy?(yes or no)");}
	else {JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");}
	if (two.equals("yes")) {JOptionPane.showMessageDialog(null, "Change something");}
	else {JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");}





}}
