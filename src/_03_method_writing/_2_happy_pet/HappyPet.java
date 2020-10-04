package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happiness = 0;
	public static void main(String[] args) {
		while (happiness < 6) {// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do for your pet?", "HappyPet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "food", "water", "take a walk", "groom", "clean up poop" }, null);

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			
			
			if(task == 0) {
				cuddle();
			}
			if(task == 1) {
				food();
			}
			if(task == 2) {
				water();
			}
			if(task == 3) {
				takeWalk();
			}
			if(task == 4) {
				groom();
			}
			if(task == 5) {
				cleanPoop();
			}
		}
//respond()
		JOptionPane.showMessageDialog(null, "IM A HAPPY PET!!!");
			
	}
	public static void cuddle(){
		happiness += 2;
		JOptionPane.showMessageDialog(null, "PUURRRRRRRRRRRRRRRR");
	}
	
	public static void food() {
		happiness += 1;
		JOptionPane.showMessageDialog(null, "Munch Munch");
	}
	
	public static void water() {
		happiness += 3;
		JOptionPane.showMessageDialog(null, "Slurp Slurp");
	}
	
	public static void takeWalk() {
		happiness += 1;
		JOptionPane.showMessageDialog(null, "Sniff Sniff");
	}
	
	public static void groom() {
		happiness += 5;
		JOptionPane.showMessageDialog(null, "Shake Shake");
	}
	
	public static void cleanPoop() {
		happiness += 1;
		JOptionPane.showMessageDialog(null, "Ruff Ruff!");
	}
	
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}