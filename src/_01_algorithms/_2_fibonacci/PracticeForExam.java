package _01_algorithms._2_fibonacci;

import java.util.Random;

import javax.swing.JOptionPane;

public class PracticeForExam {

	public static void main(String[] args) {

	
		//String yourText = JOptionPane.showInputDialog(null,"Your Text Here");
		
		String variable = "5";
		//JOptionPane.showMessageDialog(null,"/" + variable);
		
		//Robot r = new Robot();
		
		
		//EXAMPLE 1
		//Declaration
		//Random rand;
		
		//Initialization
		//rand = new Random();
		
		
		// Declaration and Initialization
		//Random r = new Random();
		
		// 0-64
		//int value = r.nextInt(150);
		
		//System.out.println(value);
		
		//EXAMPLE 2
		// 0 - 150
		Random rand;
		rand = new Random();
		int value2 = rand.nextInt(151);
	
		//EXAMPLE 3
		// 	10 - 20
		Random rand2;
		rand2 = new Random();
		// A range that contains 11 numbers
		//0 -10   -> (0) +10 = 10 - 20
		int v = rand2.nextInt(11) + 10;
		
		
		//EXAMPLE 4
		//20 - 40
		// Jack's answer
		Random number;
		number = new Random();
		int randomNumber = number.nextInt(21) + 20;
		
		
		// EXAMPLE 5
		printName("K");
		int result = mult(5,6);
		
		//EXAMPLE 6
		printLastName("LastName");
		
		int fiveSquared = squareInt(5);
		
		String student = getStudent("Joe",35);
		
		//When comparing only Strings, use .equal() or .equalsIgnoreCase()
		//If comparing numbers or booleans use == symbol
		
		
		// good on for loops
		// good on if statements
		
		
	}
	
		
	
	private static int mult(int number1, int number2) {
		return number1 * number2;
	}

	//Creating a method
	public static void printName(String name) {
		System.out.println(name);
	}
	
	public static void printLastName(String lastName) {
		System.out.println(lastName);
	}
	
	
	public static int squareInt(int number) {
		return (number * number);
	}
	
	public static String getStudent (String name, int number) {
		if (name.equals("Barnie") && number < 20) {
			return "Barnie";
		}
		if (name.equals("Joe") && number > 20) {
			return "Joe";
		}
		else {
			return "Jacob";
		}
			
	}
	
	
	
	
	
	
	
	
	
	
	
}
