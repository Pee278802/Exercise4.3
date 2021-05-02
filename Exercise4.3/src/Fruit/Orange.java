package Fruit;

class Orange extends Fruit{							//subclass of fruit
	double price;
	double weight;
	String colour;
	public Orange(String name, String colour, double weight, double price) {
		super(name);
		this.colour = colour;
		this.weight = weight;
		this.price = price;
		System.out.println();
	}
	public void Orange(int typeOfOrange){	//overloading
		String [] typesOfOrange = {"Navel", "Mandarin", "Blood Oranges", "Valencia"};
		System.out.println("Types of Orange:");
		for (int i = 0; i < typesOfOrange.length; i++) {
			System.out.println(typesOfOrange[i]);
		}		System.out.println();
	}
		
	public void totalPrice() {				//overriding
		double totalPrice = weight * price;
		System.out.println("The total price for Orange is: " + totalPrice);
		System.out.println();
	}
	
	public String toString() { //toString //overriding
		return ("Name = " + super.name + "" + "\n colour = " + colour + "\n weight = " + weight + "\n price :" + price + "per kg");
	}

}
