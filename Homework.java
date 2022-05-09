import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        
        // QUESTION - 1
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.println("Circle1 area: " + c1.getArea());
        System.out.println("Circle1 perimeter: " + c1.getPerimeter());
        System.out.println("Does circle1 contain the point (3, 3)? " + c1.contains(3, 3));
        System.out.println("Does circle1 contain the circle centered at (4, 5) and radius 10.5? "+ c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("Does circle1 overlap the circle centered at (3, 5) and radius 2.3? " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    
        // QUESTION - 2
        Scanner input = new Scanner(System.in);

		System.out.print("Enter three sides of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		System.out.print("Enter a color: ");
		String color = input.next();

		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();

		// Create a Triangle
		Triangle triangle = new Triangle(side1, side2, side3, color, filled);

		System.out.println(triangle);
	}
}
