package com.company;
import java.util.Scanner;
public class PracticeSet1 {
    public static void main(String[] args) {

        Scanner mySc = new Scanner(System.in);
        System.out.println("enter a number");
        Boolean isInt = mySc.hasNextInt();
        if(isInt==true){
            System.out.println("input is an integer");
        }
        else{
            System.out.println("Input is not an integer");
        }




    }
}
