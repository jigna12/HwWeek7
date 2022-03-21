package Homework7;
/*10.Write a java program to input any two number and ask user to enter their symbol (+, -,
        /, *) find addition, Subtraction, multiplication and division according to their symbol
        (using if else)*/

import java.util.Scanner;

public class Hwpro10 {
    public static void main(String[] args) {
        Scanner tim = new Scanner(System.in);
        int x, y, add, sub, mul;
        double div;
        String z;
        char a;

        System.out.println("Enter first number");
        x = tim.nextInt();
        System.out.println("Enter second number");
        y = tim.nextInt();
        System.out.println("Enter the symbol of operation \n : + for Addition \n: - for Subtraction \n : / for Division \n: * for Multiplication");
        z = tim.next();
        a = z.charAt(0);

        if (a == '+') {
            add = x + y;
            System.out.println("Addition of two number is :" + add);
        } else if (a == '-') {
            sub = x - y;
            System.out.println("Subtraction of two number is :" + sub);
        } else if (a == '/') {
            div = x / y;
            System.out.println("Division of two number is :" + div);
        } else if (a == '*') {
            mul = x * y;
            System.out.println("Multiplication of two number is :" + mul);
        } else
            System.out.println("Invalid input");
    }

}