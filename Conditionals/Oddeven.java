package Conditionals;
import java.util.Scanner;
public class Oddeven {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sn.nextInt();

        if(n%2 == 0){
            System.out.println("It's even number");
        }
        else{
            System.out.println("It's a odd number");
        }
        sn.close();
    }
}
