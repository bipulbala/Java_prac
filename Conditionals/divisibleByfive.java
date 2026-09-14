package Conditionals;

import java.util.Scanner;

public class divisibleByfive {
    public static void main(String[] args) {
        System.out.println("ENter a number : " );
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();

        if( n % 5 == 0) System.out.println("it's divisible");
        if (n % 5 != 0) System.out.println("it's not divisible");



        sn.close();
    }
}
