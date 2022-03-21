package Homework7;
/*16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
        “ZERO”*/

import java.util.Scanner;

public class Hwpro16<y> {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int y;
        System.out.println("Enter the any number");
        y = num.nextInt();

        if (y > 0) {
            System.out.println("Number is positive");
        } else if (y < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}


