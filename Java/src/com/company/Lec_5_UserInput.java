package com.company;
import java.util.Scanner;

public class Lec_5_UserInput {
    public static void main(String[] args) {
        System.out.println("working");

        Scanner myScanner = new Scanner(System.in);
        /*
        System.out.println("enter num 1");
        int num1 = myScanner.nextInt();
        System.out.println("enter num 2");
        int num2 = myScanner.nextInt();
        int sum = num2+num1;
        System.out.println("the sum is: "+ sum); */

      //  Boolean check = myScanner.hasNextInt();
        //System.out.println(check);

        // next() take single word input
        String desc = myScanner.nextLine();
        System.out.println(desc);
    }
}
