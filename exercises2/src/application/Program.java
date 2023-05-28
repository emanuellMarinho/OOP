package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Name: ");
		String name = sc.nextLine();

		System.out.println("Gross Salary: ");
		double grossSalary = sc.nextDouble();

		System.out.println("Tax: ");
		double tax = sc.nextDouble();

		System.out.printf("Employee: ");

		sc.close();
	}
}