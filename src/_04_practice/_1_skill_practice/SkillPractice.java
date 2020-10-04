package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {

public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
           skills.skill1();
           skills.skill2();
           skills.skill3();
           skills.skill4();
           skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have

String dimes1 = JOptionPane.showInputDialog("How many dimes do you have?");
int dimes = Integer.parseInt(dimes1);
JOptionPane.showMessageDialog(null, "You have " + 10*dimes + " cents.");

// Tell them how many cents they have (hint multiply by 10)




// Ask the user how tall they are (inches)

String tallness = JOptionPane.showInputDialog("How tall are you?");
int height = Integer.parseInt(tallness);
if (height <= 36) {
	JOptionPane.showMessageDialog(null, "You should eat wheaties.");
}


// If they are shorter than 36 inches, tell them to eat their Wheaties


}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console
	for (int i = 1; i <= 30; i++) {
		System.out.println(i);


	}
}

void skill3() { // Get a random number that is less than 20 and print it to the console
	Random r = new Random();
	int number = r.nextInt(20);
	int number2 = r.nextInt(10);
	System.out.println(number);
	System.out.println(number2);

// Get another random number that is less than 10 and print it to the console
	JOptionPane.showMessageDialog(null, (number - number2));


// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction



}

void skill4() { // In a pop-up, ask the user for the city they live in
	String city = JOptionPane.showInputDialog("Where do you live?");
	
	if (city == "San Diego") {
		JOptionPane.showMessageDialog(null, "You live in America's finest city");
	}
	else {
		JOptionPane.showMessageDialog(null, "Then you should move to Sand Diego.");
	}
// If they answered "San Diego", tell them they live in America's Finest City



// Otherwise, tell them to move to San Diego

int cars = 2;
JOptionPane.showMessageDialog(null, "8");

}

// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."



// If there is 1 car, use a pop-up to display the make/model of the car



// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.


void skill5() { // In a pop-up, ask the user for the name of their school

String school = JOptionPane.showInputDialog("What school do you go to?");
JOptionPane.showMessageDialog(null, school + " is a fantastic school.");

// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.



}
}


