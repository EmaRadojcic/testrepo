package ie.gmit.testpackage;

import java.util.*; // Needed for Scanner
import java.io.*; // Need to save and load DB
import java.util.ArrayList;
import java.util.List;

public class BreedMenu {
	private Scanner userInput;
	private Lists l;
	private boolean keepRunning;

	public BreedMenu() {
		// Create new scanner object to capture input from the user
		userInput = new Scanner(System.in);
		l = new Lists(); // Create a new StudentManager object
		keepRunning = true; // Initialise loop checker
	}

	public void display() {
		while (keepRunning) {
			// Display Menu to user
			showOptions();

			// Save user Menu option selection
			int userMenuOption = userInput.nextInt();

			// Execute option
			selectOption(userMenuOption);
			pressEnterKeyToContinue();
		}
	}

	private void showOptions() {
		System.out.println("#####################################");
		System.out.println("#   D O G S  #");
		System.out.println("#####################################");
		System.out.println("(1) make dog");
		System.out.println("(2) see number of all dogs");
		System.out.println("(3) see names of 1all dogs");

	}

	private void selectOption(int userSelection) {
		if (userSelection == 1) { // Load Students DB
			addDog();
		} else if (userSelection == 2) { // Add Student
			totaldog();
		} else if (userSelection == 3) { // Add Student
			listAllDogs();
		} else { // Invalid input
			System.out.println("Invalid choice!");
		}
	}

	private  void addDog() {
		System.out.println("give dog breed");
		String dogbreed = userInput.next();

		System.out.println("give dog name");
		String dogname = userInput.next();

		Breed newBreed = new Breed(dogbreed, dogname);
		boolean result = l.add(newBreed);

		if (result) {
			System.out.println("Dog " + dogname + " has been added successfully.");
		} else {
			System.out.println("ERROR: No space to add dog!");
			System.out.println("Please delete a dog");
		}
	}

	private void totaldog() {
		int totaldog = l.seeDogs();
		System.out.println("Total number of dogs = " + totaldog);
	}

	private void listAllDogs() { //NAMES ALL DOGS
		List<Breed> breed = l.breeds;
		for (Breed item : breed) {   
		    System.out.println(item.getDogbreed() + " " + item.getDogName());
		}
		
	}
	

	private void pressEnterKeyToContinue() {
		System.out.println("\nPress Enter key to continue...\n");
		try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
