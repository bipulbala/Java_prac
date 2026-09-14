package Conditionals;

import java.util.Scanner;

public class Profitloss {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.err.println("enter cp : ");
        int cp = sn.nextInt();

        System.err.println("enter sp : ");

        int sp = sn.nextInt();

        if (cp < sp) {
            System.out.println("seller made profit, and profit is  " + (sp -cp) );
        }
        if (cp == sp) System.out.println("neither profit nor loss");
        if (cp > sp) System.out.println("seller made loss & Loss is  " + (cp -sp));



        sn.close();
    }
    
}
