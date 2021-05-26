package com.company;
import java.util.Scanner;
public class Lec_06_PercentageCal {
    public static void main(String[] args) {
        System.out.println("ok");

        Scanner mySc = new Scanner(System.in);
        System.out.println("enter marks of 1st subject");
        float sub1 = mySc.nextFloat();
        System.out.println("enter marks of 2nd subject");
        float sub2 = mySc.nextFloat();
        System.out.println("enter marks of 3rd subject");
        float sub3 = mySc.nextFloat();
        System.out.println("enter marks of 4th subject");
        float sub4 = mySc.nextFloat();
        System.out.println("enter marks of 5th subject");
        float sub5 = mySc.nextFloat();

        float sumSub = sub1+sub2+sub3+sub4+sub5;
        float percentage = (sumSub/500)*100f;
        System.out.println("percentage is: "+percentage+"%");
        System.out.println("total  marks are:"+sumSub);


    }
}
