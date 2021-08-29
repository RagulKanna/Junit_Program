package com.Assignment;

import java.time.Year;
import java.util.Scanner;

public class Monthlypayment {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("\n Calculating monthly Emi Payment");
        System.out.println("\n Enter the Total Principle amount:");
        int p= sc.nextInt();
        System.out.println("\n Enter the no of year you have to pay:");
        int y= sc.nextInt();
        System.out.println("\n Enter the Rate of interest for you applied:");
        float r= sc.nextFloat();
        monthlypayment(p,y,r);
    }
    public static void monthlypayment(int P,int Y,float R)
    {
        int n = 12 * Y;
        float r= R /(12000);
        float si= P *  r / (1 - (float)(Math.pow((1+r),-n)));
        System.out.println(si+" is the monthly payment you have to do.");
    }
}
