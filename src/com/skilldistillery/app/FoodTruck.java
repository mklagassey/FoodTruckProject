package com.skilldistillery.app;

public class FoodTruck {
	// TODO - 4 fields: truckName, foodType, userRating, truckId
	private static int numberOfTrucks;
	private String truckName;
	private String foodType;
	private int userRating;
	private int truckId;

	// TODO - constructors: 1 no-arg and 1 with name, food type and rating fields with auto-assigned id
	public FoodTruck() {

	}

//	public FoodTruck(String tName, String fType, int uRating) {
//		truckName = tName;
//		foodType = fType;
//		userRating = uRating;
//	}

	public FoodTruck(String truckName, String foodType, int userRating) {
		this.truckName = truckName;
		this.foodType = foodType;
		this.userRating = userRating;
		this.truckId = numberOfTrucks;
		numberOfTrucks++;
	}

	// TODO - getters/setters for fields
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

	// TODO - way to print out truck info

	

//	public void pseudoClearScreen() {
//		for (int i = 0; i < 50; ++i)
//			System.out.println();
//	}

	public String toString() {
		return "FoodTruck [truckName=" + truckName + ", foodType=" + foodType + ", userRating=" + userRating
				+ ", truckId=" + truckId + "]";
	}

}
