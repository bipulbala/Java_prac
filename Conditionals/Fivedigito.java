import java.util.Scanner;
public class Fivedigito {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int n = sn.nextInt();

        if(n > 9999 && n < 10000) System.err.println(" its a five digit number");

        else System.err.println("not a five");


    }

}