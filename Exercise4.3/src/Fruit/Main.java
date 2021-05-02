package Fruit;

public class Main {

		public static void main(String[] args) {		
			Apple a = new Apple("Apple", "Red");
			System.out.println("Name: " + a.getName());
			System.out.println("Colour: " + a.colour);
			
			redApple b = new redApple("Red Apple", "Red", 2, 5);
			System.out.println("Name: " + b.getName());
			System.out.println("Colour: " + b.colour);
			System.out.println("Weight: " + b.weight + "kg");
			System.out.println("Price: RM" + b.price + "/kg");
			b.totalPrice();
			System.out.println(b.toString());
			
			greenApple c = new greenApple("Green Apple", "Green", 2, 4);
			System.out.println("Name: " + b.getName());
			System.out.println("Colour: " + b.colour);
			System.out.println("Weight: " + b.weight + "kg");
			System.out.println("Price: RM" + b.price + "/kg");
			c.totalPrice();
			System.out.println(c.toString());
			
			Orange d = new Orange("Orange", "Orange", 3.5, 5);
			System.out.println("Name: " + b.getName());
			System.out.println("Colour: " + b.colour);
			System.out.println("Weight: " + b.weight + "kg");
			System.out.println("Price: RM" + b.price + "/kg");
			d.Orange(1);
			d.totalPrice();
			System.out.println(d.toString());
			
			Strawberry e = new Strawberry ("Strawberry", 2, 10);
			System.out.println("Name: " + b.getName());
			System.out.println("Colour: " + b.colour);
			System.out.println("Weight: " + b.weight + "kg");
			System.out.println("Price: RM" + b.price + "/kg");
			e.totalPrice();
			System.out.println(e.toString());
			
	}
}
