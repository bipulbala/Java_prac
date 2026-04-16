abstract class Triangle {
    abstract void type_of_triangle();
}

class EquilateralTriangle extends Triangle {
    @Override
    void type_of_triangle() {
        System.out.println("3 sides are equal");
    }
}

class IsoscelesTriangle extends Triangle {
    @Override
    void type_of_triangle() {
        System.out.println("2 sides are equal");
    }
}

class ScaleneTriangle extends Triangle {
    @Override
    void type_of_triangle() {
        System.out.println("3 sides are different");
    }
}

public class Main {
    public static void main(String[] args) {
        Triangle equilateral = new EquilateralTriangle();
        Triangle isosceles = new IsoscelesTriangle();
        Triangle scalene = new ScaleneTriangle();

        equilateral.type_of_triangle();
        isosceles.type_of_triangle();
        scalene.type_of_triangle();
    }
}