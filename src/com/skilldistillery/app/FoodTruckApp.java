package com.skilldistillery.app;

import java.util.Scanner;

public class FoodTruckApp {
	// Allows scanner to be available in all methods
	static Scanner scan = new Scanner(System.in);
	// Constant for maximum allowed reviews
	private final int MAX_REVIEW_COUNT = 5;
	// Aggregates all reviews
	private FoodTruck[] trucks = new FoodTruck[MAX_REVIEW_COUNT];

	public static void main(String[] args) {
		// TODO - ask user for name, food type and rating
		// TODO - instantiate new truck object with info from user
		// TODO - add truck object to reviewArray
		// TODO - increment review count ++
		// TODO - check if max review count is reached, if not, repeat add truck
		// procedure
		// TODO - if max review count reached or "quit" is entered, break add truck
		// loop, enter main menu
		// TODO - display main menu with 4 options: list all, avg rating, highest rated
		// or quit
		// TODO - if list all: display all trucks in reviewArray, return to main menu on
		// enter
		// TODO - if avg rating: calculate avg with ratings from each truck / num of
		// trucks, enter to return to main menu
		// TODO - if highest rated: find highest rating and display all truck info,
		// return to main menu
		// TODO - if quit: break loop, display outro msg

		int reviewCount;
		// Instantiate review process object
		FoodTruckApp newReview = new FoodTruckApp();
		// Returns the number of reviews user input for use in main menu
		reviewCount = newReview.getTruckInfo();
		// main menu method
		newReview.mainMenu(reviewCount);
		scan.close();
	}
	
	public void pseudoClearScreen() {
		for (int i = 0; i < 50; ++i)
			System.out.println();
	}

	public int getTruckInfo() {
		int count = 0;
		String name;
		String foodType;
		int rating;

		do {
			pseudoClearScreen();
			System.out.println("Please enter name of food truck: ");
			name = scan.next(); // TODO - Validate input
			if (name.equalsIgnoreCase("quit"))
				break;
			System.out.println("Please enter type of food served: ");
			foodType = scan.next(); // TODO - Validate input
			System.out.println("Please enter the rating of the truck (1-5): ");
			rating = scan.nextInt(); // TODO - Validate input
			
			FoodTruck truck = new FoodTruck(name, foodType, rating);
			trucks[count] = truck;
//			for (FoodTruck foodTruck : trucks) {
//				System.out.println(foodTruck);
//			}
			count++;

		} while (count < MAX_REVIEW_COUNT);
		return count;
	}

	public void mainMenu(int reviewCount) {
		boolean continueApp = true;

		while (continueApp) {
			pseudoClearScreen();
			System.out.println("Please choose an option: ");
			System.out.println("1) List all food trucks");
			System.out.println("2) Show average rating of trucks");
			System.out.println("3) Show highest rated truck");
			System.out.println("4) Quit");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				for (int i = 0; i < reviewCount; i++) {
					System.out.println(trucks[i]);
				}
				System.out.println("Please press 1 to continue------->");
				scan.next();
				break;
			case 2:
				int totalScore = 0;
				for (int i = 0; i < reviewCount; i++) {
					totalScore += (trucks[i].getUserRating());
				}
				int averageScore = (totalScore / reviewCount);
				System.out.print("Average: " + averageScore);
				System.out.println();
				System.out.println("Please press 1 to continue------->");
				scan.next();
				break;
			case 3:
				int highScore = 0;
				int truckIndex = 0;
				System.out.println("Highest user rating: ");
				for (int i = 0; i < reviewCount; i++) {
					if (trucks[i].getUserRating() > highScore) {
						truckIndex = i;
						highScore = trucks[i].getUserRating();
					}

				}
				System.out.println(trucks[truckIndex]);
				System.out.println("Please press 1 to continue------->");
				scan.next();
				break;
			case 4:
				continueApp = false;
				break;
			default:
				System.out.println("ERROR! Invalid input, please try again.");
				System.out.println("Please press 1 to continue------->");
				scan.next();
				break;
			}
		}
		System.out.println("Thank you for using the Food Truck app, please follow us on social media!");
	}

}
