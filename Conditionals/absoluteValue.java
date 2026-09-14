//take integer input and print the absolute value of the number

package Conditionals;

import java.util.Scanner;

public class absoluteValue {
    public static void main(String[] args) {
        System.out.println(" enter a postive or negative value : ");

        Scanner sn = new Scanner (System.in);
        int n =  sn.nextInt();

        if ( n < 0) System.out.println( -n);
        else System.out.println( n);

        sn.close();
    }   
}
