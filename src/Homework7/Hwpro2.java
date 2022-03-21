package Homework7;
/*2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
        not?*/

import java.util.Scanner;

public class Hwpro2 {
    public static void text() {
        Scanner tim = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Enter the year = ");
        a = tim.nextInt();
        b = a % 4;
        c = a % 100;
        d = a % 400;
        if (b == 0) {
            if (c == 0) {
                if (d == 0) {
                    System.out.println("It is leap year ");
                } else {
                    System.out.println("It is not leap year");
                }
            } else {
                System.out.println("It is leap year ");
            }

        } else {
            System.out.println("It is not leap year");
        }
    }

    public static void main(String[] args) {
        text();

    }
}
