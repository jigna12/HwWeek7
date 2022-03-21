package Homework7;
/*Write a java program to input any year like (ex.2007) and find out if it is leap year or
        not?*/

import java.util.Scanner;

public class Hwpro2a {
    public static void tim() {
        Scanner tim1 = new Scanner(System.in);
        int a;
        System.out.println("Enter the year");
        a = tim1.nextInt();
        boolean b = (a % 4) == 0;
        boolean c = (a % 100) != 0;
        boolean d = (a % 400) == 0;
        if ((b && c) || (b && d)) {
            //if(b && (c || d)){
            System.out.println("Year is a leap year");
        } else
            System.out.println("Year is not a leap year");

    }

    public static void main(String[] args) {
        tim();
    }
}
