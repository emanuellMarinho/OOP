package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height: ");

		double width = sc.nextDouble();
        double height = sc.nextDouble();
        
		sc.close();

		Rectangle rectangle = new Rectangle(width, height);
	    System.out.println("Area: " + rectangle.calculateArea());
	    System.out.println("Perimeter: " + rectangle.calculatePerimeter());
	    System.out.println("Diagonal: " + rectangle.calculateDiagonal());
	}
}