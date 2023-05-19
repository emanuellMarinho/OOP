package entities;

public class Triangle {

	// Atributos 
	public double a;
	public double b;
	public double c;

	// Tipo de dado que o método/função retorna -> "Double"
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
