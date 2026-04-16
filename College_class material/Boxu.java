
import java.util.Scanner;

class Boxu {
    double length, breadth, height, volume;

    Boxu() {
        this.length = 1;
        this.breadth = 2;
        this.height = 3;
    }

    Boxu(double val) {
        this.length = val;
        this.breadth = val;
        this.height = val;
    }

    Boxu(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    void calculateVolume() {
        this.volume = length * breadth * height;
    }

    void display() {
        System.out.println(this.volume);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimensions for box i:");
        double lengthI = scanner.nextDouble();
        double breadthI = scanner.nextDouble();
        double heightI = scanner.nextDouble();
        Boxu i = new Boxu(lengthI, breadthI, heightI);

        System.out.println("Enter the dimension for box j:");
        double valJ = scanner.nextDouble();
        Boxu j = new Boxu(valJ);

        System.out.println("Enter the dimensions for box k:");
        double lengthK = scanner.nextDouble();
        double breadthK = scanner.nextDouble();
        double heightK = scanner.nextDouble();
        Boxu k = new Boxu(lengthK, breadthK, heightK);

        scanner.close();

        i.calculateVolume();
        j.calculateVolume();
        k.calculateVolume();

        i.display();
        j.display();
        k.display();
    }
}







