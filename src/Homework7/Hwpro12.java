package Homework7;
/*12. Write a program that tells us input value is number or an alphabet or symbol*/

import java.util.Scanner;

public class Hwpro12 {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        String x;
        char y;
        System.out.println("Enter anything from keyboard");
        x = test.next();
        y = x.charAt(0);

        if ((y >= 'a' && y <= 'z') || (y >= 'A' && y <= 'Z')) {
            System.out.println("Input is an alphabet");
        } else if ((y >= '0' && y <= '9')) {
            System.out.println("Input is number");
        } else
            System.out.println("Input is symbol");

    }
}
