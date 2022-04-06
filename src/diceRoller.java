import java.util.Scanner;

public class diceRoller {

	public static void main(String[] args) {
	
	
		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.println("");
		
		Scanner input = new Scanner(System.in);
		
		String choice = "y";
		
	do {
		System.out.println("How many sides should each die have?: ");
		input.nextInt();
		
		int die1;
		int die2;
		
		die1 = (int)(Math.random()*6) +1;
		die2 = (int)(Math.random()*6) +1;
		
		System.out.println(die1);
		System.out.println(die2);
		
		System.out.print("Continue? (y/n): ");
        choice = input.next();
        System.out.println(""); 
	
	} while (choice.equalsIgnoreCase("y") && !(choice.equalsIgnoreCase("n")));
		System.out.println("Goodbye");
		input.close();
	
		
		
	
	}


}
