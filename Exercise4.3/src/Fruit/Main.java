package Fruit;

public class Main {

		public static void main(String[] args) {		
			Apple a = new Apple("Apple", "Red");
			System.out.println("Name: " + a.getName());
			System.out.println("Colour: " + a.colour);
			
			redApple b = new redApple("Red Apple", "Red", 2, 5);
			System.out.println(b.toString());
			b.totalPrice();
			
			greenApple c = new greenApple("Green Apple", "Green", 2, 4);;
			System.out.println(c.toString());
			c.totalPrice();
			
			Orange d = new Orange("Orange", "Orange", 3.5, 5);
			d.Orange(1);
			System.out.println(d.toString());
			d.totalPrice();
			
			Strawberry e = new Strawberry ("Strawberry", 2, 10);
			System.out.println(e.toString());
			e.totalPrice();
			
	}
}
