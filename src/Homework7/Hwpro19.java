package Homework7;

/*19. Write a Java program to calculate the average value of array elements.*/
public class Hwpro19 {
    public static void main(String[] args) {
        int[] numbers = new int[]{10, 100, 300, 450, 670, 88, 99, 33, 44};//calculate sum of all array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];//calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);

    }
}
