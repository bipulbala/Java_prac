import java.util.Scanner;

class Demo{

    public static void main(String[] args) {
        System.out.println("Enter a number");


        Scanner sc = new Scanner(System.in);

        int pub =sc.nextInt();

        System.out.println(pub);
        sc.close();;
    }
}