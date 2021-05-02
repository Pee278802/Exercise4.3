package Fruit;

class redApple extends Apple{						//subclass of Apple
	protected double price, weight;
	public redApple(String name, String colour, double weight, double price) {
		super(name, colour);
		this.weight = weight;
		this.price = price;
		System.out.println();
	}
	public void totalPrice() {		//overriding
		double totalPrice = weight * price;
		System.out.println("The total price for red apple is:" + totalPrice);
		System.out.println();
	}
	public String toString() { 		//toString //overriding
		return ("Name = " + super.name + "" + "\n colour = " + colour + "\n weight = " + weight + "\n price :" + price + "per kg");
	}

}
