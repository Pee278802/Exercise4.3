package Fruit;

class Strawberry extends Fruit{						//subclass of fruit
	double price;
	String colour;
	int weight;
	public Strawberry(String name, int weight, double price) {
		super(name);
		this.weight = weight;
		this.price = price;
		System.out.println();
	}
	public void totalPrice() {				//overriding
		double totalPrice = this.weight * this.price;
		System.out.println("The total price for Strawberry is: " + totalPrice);
		System.out.println();
	}
	
	public String toString() { //toString //overriding
		return ("Name = " + super.name + "\n weight = " + weight + "\n price :" + price + "per kg");
	}
}
