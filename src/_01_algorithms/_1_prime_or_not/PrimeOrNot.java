package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String numStr = JOptionPane.showInputDialog("Please enter a number");
		int num = Integer.parseInt(numStr);
		boolean prime = true;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				JOptionPane.showMessageDialog(null, num + " is not a prime number.");
				prime = false;
			}
		}
		if (prime) {
		JOptionPane.showMessageDialog(null, num + " is a prime number.");
		}
	}
		
}
