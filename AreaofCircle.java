import java.util.Scanner;

public class AreaofCircle {
    double pie = Math.PI; // It provides more accurate results.
   public static void main(String[] args) {
       
      try (Scanner sc = new Scanner(System.in)) {
    System.out.println("Enter the radius of the circle:");
    double radius = sc.nextDouble();

    double area = Math.PI * radius * radius;
    System.out.println("Area of that circle will be: " + area);
}
   } 
}

/*  Scanner sc = new Scanner(System.in); opens a resource (input stream),
 and Java expects you to close it after use. Otherwise, it may lead to a resource leak. */
 // ( for manually closing scanner class we should use sc.close();) 
//✔but in real projectswe use 'try block ' that Automatically closes the scanner automatically
// and took (Scanner sc = new Scanner(System.in)) as parameter of try block
//✔ No warning
//✔ Cleaner code