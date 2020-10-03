package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_Robot {
	
static Robot robot = new Robot();

	
public static void main(String[] args) {
	
		
    String[] options2 = {"Red", "Green", "Blue"};
    int input2 = JOptionPane.showOptionDialog(null, "Returns the position of your choice on the array",
            "Click a button",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options2, options2[0]);
    if (input2 == 0) {
    	robot.setPenColor(255,0,0);
    }
    if (input2 == 1) {
    	robot.setPenColor(0,255,0);
    }
    if (input2 == 2) {
    	robot.setPenColor(0,0,255);
    }
	
    String[] options = {"Square", "Triangle", "Circle"};
    int input = JOptionPane.showOptionDialog(null, "Returns the position of your choice on the array",
            "Click a button",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
    if (input == 0) {
    	drawSquare();
    }
    if (input == 1) {
    	drawTriangle();
    }
    if (input == 2) {
    	drawCircle();
    }

}

public static void drawSquare() {
	robot.penDown();
	//robot.setPenColor(0,0,255);
	robot.setSpeed(100);
	robot.hide();
	for (int i = 1; i <= 4; i++) {	
		robot.move(90);
		robot.turn(90);
	}
}

public static void drawTriangle() {
	robot.penDown();
	//robot.setPenColor(0,0,255);
	robot.setSpeed(100);
	robot.hide();
	for (int i = 1; i <= 3; i++) {
		robot.move(60);
		robot.turn(120);

		}
	}


public static void drawCircle() {
	robot.penDown();
	//robot.setPenColor(0,0,255);
	robot.setSpeed(100);
	robot.hide();
	for (int i = 1; i <= 360; i++) {
		robot.move(1);
		robot.turn(1);
		}
	}
}






