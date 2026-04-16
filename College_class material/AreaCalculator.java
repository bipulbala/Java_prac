public class AreaCalculator {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        double circleRadius = 5.0;
        double triangleBase = 4.0;
        double triangleHeight = 3.0;

        double circleArea = calculator.area(circleRadius);
        double triangleArea = calculator.area(triangleBase, triangleHeight);

        System.out.println("Area of the circle: " + circleArea);
        System.out.println("Area of the triangle: " + triangleArea);
    }

    // Method to calculate the area of a circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a triangle
    public double area(double base, double height) {
        return 0.5 * base * height;
    }
}