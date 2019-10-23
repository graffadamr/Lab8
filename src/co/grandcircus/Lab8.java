package co.grandcircus;

import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] names = { "Andy McIntyre", "Max Greenstone", "Catherine Pascal", "Janice Jeffrietown", "Connor Birch",
				"Tara Stimpson", "Ione Skye", "Ricky Starr", "Conrad Gifford", "Rowan Bean" };
		String[] favFoods = { "cereal", "pizza", "hamburgers", "steak", "sushi", "pou pou platters", "salad",
				"ice cream", "lobster", "potato pancakes" };
		String[] hometowns = { "Boise, ID", "Anchorage, AK", "Boulder, CO", "Detroit, MI", "Grand Rapids, MI",
				"Hell, MI", "Pasadena, CA", "Austin, TX", "Albuquerque, NM", "Chicago, IL" };
		String continueQuest = "";
		String personName = "";

		System.out.print("Welcome to our Java class. ");
		do {
			System.out.println("Which student would you like to know more about? (enter a number between 1-10): ");
			int nameNum = scan.nextInt() - 1;
			try {
				scan.nextLine();
				personName = names[nameNum];
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("That student does not exist. Please try again. (enter a number 1-10): ");
				continue;
			}
			System.out.println("Student " + (nameNum + 1) + " is " + personName + ". What would you like to know about "
					+ personName + "? (Enter \"hometown\" or \"favorite food\":");
			String answer = scan.nextLine();

			if (answer.equalsIgnoreCase("hometown")) {
				System.out.print(personName + " is from " + hometowns[nameNum]
						+ ". Would you like to know more? (enter \"yes\" or \"no\"): ");
				System.out.println();
				continueQuest = scan.next();
				if (continueQuest.equalsIgnoreCase("yes")) {
					System.out.println(personName + "'s favorite food is " + favFoods[nameNum] + ".");
					System.out.println();
				} else if (continueQuest.equalsIgnoreCase("no")) {
					System.out.println("Thanks!");
				}

			} else if (answer.equalsIgnoreCase("favorite food")) {
				System.out.print(personName + "'s favorite food is " + favFoods[nameNum]
						+ ". Would you like to know more? (enter \"yes\" or \"no\"): ");
				System.out.println();
				continueQuest = scan.next();
				if (continueQuest.equalsIgnoreCase("yes")) {
					System.out.println(personName + " is from " + hometowns[nameNum] + ".");
				} else if (continueQuest.equalsIgnoreCase("no")) {
					System.out.println("Thanks!");
				}
			}

		} while (continueQuest.equalsIgnoreCase("yes"));

		scan.close();
	}

}
