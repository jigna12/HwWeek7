package Homework7;
/*7. Write a java program input sales id, seller's name, sales amount, and salary basic and
        then fined this sales
        Commission
        Sales amount >= 50,000 35%
        Sales amount >= 30,000 20%
        >= 20,000 10%
        >= 10,000 5%
< 10,000 2%*/

import java.util.Scanner;

public class Hwpro7 {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        double Id, SAmount, BS, Commission, GSalary;
        String Name;
        System.out.println("Enter Sales ID ");
        Id = text.nextInt();
        System.out.println("Enter seller's name");
        Name = text.next();
        System.out.println("Enter sales amount");
        SAmount = text.nextInt();
        System.out.println("Enter basic salary");
        BS = text.nextInt();
        if (SAmount >= 50000) {
            Commission = SAmount * 0.35;
            System.out.println("Commission  " + Commission);
        } else if (SAmount >= 30000) {
            Commission = SAmount * 0.20;
            System.out.println("Commission   " + Commission);
        } else if (SAmount >= 20000) {
            Commission = SAmount * 0.10;
            System.out.println("Commission   " + Commission);
        } else if (SAmount >= 10000) {
            Commission = SAmount * 0.05;
            System.out.println("Commission   " + Commission);
        } else {
            Commission = SAmount * 0.02;
            System.out.println("Commission   " + Commission);
        }
        GSalary = BS + Commission;
        System.out.println("____________________________________________");
        System.out.println("|                Salary Slip                |");
        System.out.println("|___________________________________________|");
        System.out.println("| Employee ID          : " + Id + "           " + "|");
        System.out.println("| Employee Name        : " + Name + "                " + "|");
        System.out.println("|___________________________________________|");
        System.out.println("| Basic Salary         : " + BS + "            " + "|");
        System.out.println("| Sales Amount         : " + SAmount + "           " + "|");
        System.out.println("| Sales Commission     : " + Commission + "           " + "|");
        System.out.println("|___________________________________________|");
        System.out.println("| Gross Salary         : " + GSalary + "    " + "|");
        System.out.println("|===========================================|");
    }
}
