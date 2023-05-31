package exercises;

public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Área
    public double calculateArea() {
        return width * height;
    }

    // Perímetro
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Diagonal
    public double calculateDiagonal() {
        return Math.sqrt(width * width + height * height);
    }
}
