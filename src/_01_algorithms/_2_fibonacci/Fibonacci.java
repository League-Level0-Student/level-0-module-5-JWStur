package _01_algorithms._2_fibonacci;

import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int num3 = num1;
		String input = JOptionPane.showInputDialog("How many numbers of the fibonacci sequence do you want to know?");
		int length = Integer.parseInt(input);
		
		for (int i = 2; i <= length; i++) {
			
			num1 = num2;
			num2 = num3;
			num3 = num1 + num2;
			System.out.println(num3);
		}
	}
}
