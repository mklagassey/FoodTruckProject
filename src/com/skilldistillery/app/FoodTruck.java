package com.skilldistillery.app;

public class FoodTruck {
	private static int numberOfTrucks = 1;
	private String truckName;
	private String foodType;
	private int userRating;
	private int truckId;

	// No-arg constructor
	public FoodTruck() {
		this.truckId = numberOfTrucks;
		numberOfTrucks++;
	}
	// Standard constructor with user input fields and auto-assigned internal ID
	public FoodTruck(String truckName, String foodType, int userRating) {
		this.truckName = truckName;
		this.foodType = foodType;
		this.userRating = userRating;
		this.truckId = numberOfTrucks;
		numberOfTrucks++;
	}

	// Getters and setters for user-facing fields
	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getUserRating() {
		return userRating;
	}

	public void setUserRating(int userRating) {
		this.userRating = userRating;
	}
	public int getTruckId() {
		return truckId;
	}

	// TODO - way to print out truck info


	public String toString() {
		return "Truck name: " + truckName + ", Type of food: " + foodType + ", Rating: " + userRating;
	}

}
