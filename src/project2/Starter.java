package project2;

public class Starter {

	public static void main(String[] args) {
		String[] dish = {"Jellof Rice with meat", "Sharwama", "Suya", "Fufu with egusi", "Salad"};
		Double[] cost = {12.99, 10.50, 11.99, 12.99, 9.99};
		
		// create a Payment instance with reference to myPayment
		//When we call the Payment constructor of the payment class, we created a 2 ArrayList objs  
		Payment myPayment = new Payment();
		myPayment.addOrder("Jellof Rice with meat", 3, dish, cost);
		myPayment.addOrder("Sharwama", 5, dish, cost);
		myPayment.addOrder("Suya", 10, dish, cost);
		myPayment.addOrder("Fufu with egusi", 3, dish, cost);
		myPayment.addOrder("Salad", 2, dish, cost);
		
		myPayment.getOrder();
		System.out.println(myPayment.getTotal());

  }
}
