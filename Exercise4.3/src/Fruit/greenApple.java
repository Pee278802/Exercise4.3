package Fruit;

class greenApple extends Apple{
	private double price, weight;
	public greenApple(String name, String colour, double weight, double price) {
		super(name, colour);
		this.weight = weight;
		this.price = price;
}

	public void totalPrice() {		//overriding
		double totalPrice = weight * price;
		System.out.println("The total price for green apple is:" + totalPrice);
		System.out.println();
}
	public String toString() { //toString //overriding
		return ("Name = " + super.name + "" + "\n colour = " + super.colour + "\n weight = " + weight + "\n price :" + price + "per kg");
		

}
}
