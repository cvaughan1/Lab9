package circle;

import java.util.Scanner;
//import CircumferenceLab.Circle;

public class CircleApp {

	public static void main (String [ ] args) {
		double radius = 0;
		int count = 0;
		String choice = "y";
		Circle circle = new Circle(radius);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the Circle Tester!");
		
		while(choice.equalsIgnoreCase("y")) {
			
			System.out.println("Enter radius: ");
			radius = scan.nextDouble();
			
			System.out.println("Circumference: " + circle.getformattedCircumference());
			System.out.println("Area: " + circle.getformattedArea());
		
			count = circle.getObjectCount();
			
			System.out.println("would you like to create another Circle? (y/n): ");
			choice = scan.next();
		}
			System.out.println("Goodbye!");
			System.out.println("You created " + count + " Circles");
			scan.close();
	}
}
