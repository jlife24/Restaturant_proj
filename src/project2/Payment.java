package project2;

import java.util.ArrayList;

public class Payment {
	private ArrayList<String> foodOrdered;
	private ArrayList<Integer> orderedAmount;
	
	//create a arraylist constructor
	public Payment() {
		foodOrdered = new ArrayList<String>();
		orderedAmount = new ArrayList<Integer>();
	}
	
	//in var for payment obj to remember the total amount of payment main
	private double totalAmount;
	
	public double getTotal() {
		return totalAmount;
	}
	
	public void addOrder(String meal, int amount, String[]dish, Double[] cost) {
		foodOrdered.add(meal);
		orderedAmount.add(amount);
		
		for(int i = 0; i < dish.length; i++) {
			if(meal.equals(dish[i])) {
				//totalAmount is initialized to zero when a Payment instance is constructed
				totalAmount += amount * cost[i];
			}
		}
	}
	
	public void getOrder() {
		for(int i = 0; i < foodOrdered.size(); i++) {
			System.out.println(foodOrdered.get(i) + " " + orderedAmount.get(i));
		}
	}
}
