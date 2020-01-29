package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
static String pet = JOptionPane.showInputDialog(null, "What pet do you want.");
	public static void main(String[] args) {	
		
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
 
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		for (int i = 0; i < 10; i++) {
			
		
		int task = JOptionPane.showOptionDialog(null, "What do you want to do with your " + pet, "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Food", "walk", "play" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if(task==0) {
	food();
}
	if(task==1) {
		walk();
	}
if(task==2) {
	play();
}
System.out.println(happinessLevel);
		
// 6. If you determine the happiness level is large enough, tell the
//    user that he loves his pet and use break; to exit for loop.
if(happinessLevel==10) {
	JOptionPane.showInputDialog(null, "you can have a break");
break;
}
		}
	}

	static // 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
void food() {
		happinessLevel++;
	JOptionPane.showInputDialog(null, "feeding the " + pet);
}
static void walk() {
	happinessLevel+=3;
JOptionPane.showInputDialog(null, "walking the " + pet);
}
static void play() {
	happinessLevel+=5;
	JOptionPane.showInputDialog(null, "playing with the " + pet);
}









}