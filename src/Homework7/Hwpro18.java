package Homework7;
/*18. Write a Java program to sum values of an array.*/

public class Hwpro18 {
    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100, 200, 300, 400, 450, 670, 780, 880, 900};
        int sum = 0;
        for (int i : array)
            sum += i;
        System.out.println("Value of sum : " + sum);
    }
}
