class Figure {
    protected double dimension1;
    protected double dimension2;

    public Figure(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public double area() {
        return 0;
    }
}

class Rectangle extends Figure {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double area() {
        return dimension1 * dimension2;
    }
}

class Triangle extends Figure {
    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double area() {
        return 0.5 * dimension1 * dimension2;
    }
}

public class Main {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle(10, 5);
        Figure triangle = new Triangle(10, 5);

        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());
    }
}