package Homework7;
/*5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
        salary
        HRA = basic salary 10%
        DA = Basic salary 8%
        TA = Basic salary 9%
        PF= Basic salary 20%
        Gross salary = basic salary + HRA + TA + DA –PF*/

import java.util.Scanner;

public class Hwpro5 {
    public static void tim() {
        double HRA, TA, DA, PF, Salary, BS, Gross_Salary;
        int Employeeid;
        String Employeename;
        Scanner tim1 = new Scanner(System.in);
        System.out.println("Please Enter Employee ID : ");
        Employeeid = tim1.nextInt();
        System.out.println("Please Enter Employee Name : ");
        Employeename = tim1.next();
        System.out.println("Please Enter Basic Salary : ");
        BS = tim1.nextFloat();
        HRA = BS * 0.10;
        DA = BS * 0.08;
        TA = BS * 0.09;
        PF = BS * 0.20;
        Gross_Salary = BS + HRA + DA + TA - PF;
        System.out.println("____________________________________________");
        System.out.println("|                Salary Slip                |");
        System.out.println("|___________________________________________|");
        System.out.println("| Employee ID          : " + Employeeid + "           " + "|");
        System.out.println("| Employee Name        : " + Employeename + "                " + "|");
        System.out.println("|___________________________________________|");
        System.out.println("| Basic Salary         : " + BS + "            " + "|");
        System.out.println("| HRA 10%              : " + HRA + "           " + "|");
        System.out.println("| TA 8%                : " + TA + "           " + "|");
        System.out.println("| DA 9%                : " + DA + "            " + "|");
        System.out.println("|PF -20%               : " + PF + "            " + "|");
        System.out.println("|___________________________________________|");
        System.out.println("| Gross Salary         : " + Gross_Salary + "    " + "|");
        System.out.println("|===========================================|");
    }

    public static void main(String[] args) {
        tim();
    }


}
