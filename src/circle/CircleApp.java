package circle;

import java.util.Scanner;


public class CircleApp {

	public static void main (String [ ] args) {
		double radius = 0;
		int count = 0;
		String choice = "y";
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the Circle Tester!");
		
		while(choice.equalsIgnoreCase("y")) {
			
			System.out.print("Enter radius: ");
			radius = scan.nextDouble();
			Circle circle = new Circle(radius);
			circle.getCircumference();
			circle.getArea();
	System.out.println("Circumference: " + circle.getFormattedCircumference());
		System.out.println("Area: " + circle.getFormattedArea());
		
		    count = Circle.getObjectCount();
			
			System.out.print("would you like to create another Circle? (y/n): ");
			choice = scan.next();
		}
			System.out.println("Goodbye!");
			System.out.println("You created " + count + " Circles");
			scan.close();
	}
}
