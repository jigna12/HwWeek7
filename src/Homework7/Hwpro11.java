package Homework7;
/*11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
        and 5 separately.*/

import java.util.Scanner;

public class Hwpro11 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int i;

        System.out.println();
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
