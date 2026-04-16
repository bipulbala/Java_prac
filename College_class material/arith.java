import java.util.*;
public class arith {
    void add(int a, int b){
        int sum = a+b;
        System.out.println("Add :" +sum);
    }
    void substract(int a, int b){
        int substract =  a-b;
        System.out.println("Substract :" +substract);
    }
    void multiply(int a,int b){
        int multiply = a*b;
        System.out.println("Multiply :" +multiply);
    }
    void divide(int a, int b){
        int divide = a/b;
        System.out.println("Divide :" +divide);
    }
}
class Arithmatic{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = obj.nextInt();
        System.out.println("Enter the value of b :");
        int b = obj.nextInt();
        arith obj1 = new arith();

String choice = obj.next();
if (choice.equalsIgnoreCase("yes")) {
    System.out.println("Enter the value of a :");
    a = obj.nextInt();
    System.out.println("Enter the value of b :");
    b = obj.nextInt();
    System.out.println("Choose an operation:");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    int choiceOp = obj.nextInt();
    switch (choiceOp) {
        case 1:
            obj1.add(a, b);
            break;
        case 2:
            obj1.substract(a, b);
            break;
        case 3:
            obj1.multiply(a, b);
            break;
        case 4:
            obj1.divide(a, b);
            break;
        default:
            System.out.println("Invalid choice");
    }
} else {
    System.out.println("Exiting");
}
}