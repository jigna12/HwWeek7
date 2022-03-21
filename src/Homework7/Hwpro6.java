package Homework7;
/*6. Write a java program to input any number and find out if it’s odd or even*/

import java.util.Scanner;

public class Hwpro6 {
    public static void main(String[] args) { //main method
        Scanner tim = new Scanner(System.in);//create an object for Scanner class
        System.out.println("Enter the number");
        int xyz = tim.nextInt();//read user input

        if ((xyz ^ 1) == xyz + 1) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd ");
        }
    }
}