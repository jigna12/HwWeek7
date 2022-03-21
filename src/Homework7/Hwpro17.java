package Homework7;
/*17. Write a Java program to sort a numeric array and a string array.*/

import java.util.Arrays;

public class Hwpro17 {
    public static void main(String[] args) {


        int[] narray = {
                25, 540, 50, 67, 89, 4245, 33, 56, 588, 11, 23, 11198, 675, 321, 90, 912, 1245, 3654, 5694, 45454
        };
        String[] sarray = {
                "Tim", "Sunday", "January", "London", "Viha", "Ashok", "India", "Rose", "White", "Sun", "C++", "Java",
        };
        System.out.println("Original array : " + Arrays.toString(narray));
        Arrays.sort(narray);
        System.out.println("Sort the array : " + Arrays.toString(narray));
        System.out.println("Original String array : " + Arrays.toString(sarray));
        Arrays.sort(sarray);
        System.out.println("Sort String array :" + Arrays.toString(sarray));
    }
}
