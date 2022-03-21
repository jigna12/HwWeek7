package Homework7;
/*20. Write a Java program to test if an array contains a specific value*/

import java.util.Arrays;

public class Hwpro20 {
   public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] narray = {
                25, 540, 50, 67, 89, 4245, 33, 56, 588, 11, 23, 11198, 675, 321, 90, 912, 1245, 3654, 5694, 45454
        };

        //System.out.println(contains(narray, 26));//false
        System.out.println(contains(narray, 25));//true

    }
}
