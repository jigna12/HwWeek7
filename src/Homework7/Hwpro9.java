package Homework7;
/*9. Same as above program-8 using switch statement*/

import java.util.Scanner;

public class Hwpro9 {

    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        String city, name;
        char x;
        System.out.println("Input Any alphabet from A to F : ");
        name = xyz.next();
        x = name.charAt(0);

        switch (x) {
            case 'A':
                System.out.println("Your city name is Ahmedabad");
                break;
            case 'a':
                System.out.println("Your city name is Ahmedabad");
                break;
            case 'B':
                System.out.println("Your city name is Bombay");
                break;
            case 'b':
                System.out.println("Your city name is Bombay");
                break;
            case 'C':
                System.out.println("Your city name is Chennai");
                break;
            case 'c':
                System.out.println("Your city name is Chennai");
                break;
            case 'D':
                System.out.println("Your city name is Delhi");
                break;
            case 'd':
                System.out.println("Your city name is Delhi");
                break;
            case 'E':
                System.out.println("Your city name is Edmonton ");
                break;
            case 'e':
                System.out.println("Your city name is Edmonton ");
                break;
            case 'F':
                System.out.println("Your city name is Faro");
                break;
            case 'f':
                System.out.println("Your city name is Faro");
                break;
            default:
                System.out.println("Invalid Input ");

        }
    }
}