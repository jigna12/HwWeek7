package Homework7;

/* 1. Write a java program that tells us that Input number is odd or even?
    HINT: use ternary operator (? :)*/

import java.util.Scanner;

public class Hwpro1 {
    public static void tim() {
        int x, y;
        Scanner tim1 = new Scanner(System.in);
        System.out.println("Enter any number : ");
        x = tim1.nextInt();
        y = x % 2;
        if (y == 0) {
            System.out.println("Input number is even");
        } else {
            System.out.println("Input number is odd");
        }
    }

    public static void main(String[] args) {
        tim();
    }

}

