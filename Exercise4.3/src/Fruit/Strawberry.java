package Fruit;

class Strawberry extends Fruit{						//subclass of fruit
	double price;
	String colour;
	int weight;
	public Strawberry(String name, int weight, double price) {
		super(name);
		this.weight = weight;
		this.price = price;
	}
	public void totalPrice() {				//overriding
		double totalPrice = weight * price;
		System.out.println("The total price for Strawberry is: " + totalPrice);
	}
	
	public String toString() { //toString //overriding
		return ("Name = " + super.name + "\n weight = " + weight + "\n price :" + price + "per kg");
	}
}
