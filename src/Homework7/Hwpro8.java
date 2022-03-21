package Homework7;
/*8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
        any other alphabet should be invalid entry*/

import java.util.Scanner;

public class Hwpro8 {
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        String name;
        char x;
        System.out.println("Input Any alphabet from A to F : ");
        name = xyz.next();
        x = name.charAt(0);

        if (x == 'A' || x == 'a') {
            System.out.println("Your city name is Ahmedabad");
        } else if (x == 'B' || x == 'b') {
            System.out.println("Your city name is Bombay");
        } else if (x == 'C' || x == 'c') {
            System.out.println("Your city name is Chennai");
        } else if (x == 'D' || x == 'd') {
            System.out.println("Your city name is Delhi");
        } else if (x == 'E' || x == 'e') {
            System.out.println("Your city name is Edmonton ");
        } else if (x == 'F' || x == 'f') {
            System.out.println("Your city name is Faro");
        } else {
            System.out.println("Invalid Input :");
        }
    }
}