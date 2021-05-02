package Fruit;

public class Main {

		public static void main(String[] args) {		
			Apple a = new Apple("Apple", "Red");
			System.out.println("Name: " + a.getName());
			System.out.println("Colour: " + a.colour);
			System.out.println("-----------------------------------------");
			
			redApple b = new redApple("Red Apple", "Red", 2, 5);
			System.out.println(b.toString());
			b.totalPrice();
			System.out.println("-----------------------------------------");
			
			greenApple c = new greenApple("Green Apple", "Green", 2, 4);;
			System.out.println(c.toString());
			c.totalPrice();
			System.out.println("-----------------------------------------");
			
			Orange d = new Orange("Orange", "Orange", 3.5, 5);
			d.Orange(1);
			System.out.println(d.toString());
			d.totalPrice();
			System.out.println("-----------------------------------------");
			
			Strawberry e = new Strawberry ("Strawberry", 2, 10);
			System.out.println(e.toString());
			e.totalPrice();
			System.out.println("-----------------------------------------");
			
	}
}
