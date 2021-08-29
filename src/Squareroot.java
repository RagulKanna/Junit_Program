package com.Assignment;

import java.util.Scanner;

public class Squareroot {
    public static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        sqrt();
    }
    public static void sqrt()
    {
        System.out.println("\n Enter the non negative number:");
        int c=sc.nextInt();

        if(c>0)
        {
            double epsilon = Math.pow(10, (-15));
            double t = c;
            while (Math.abs(t - c / t) > epsilon * t) {
                t = (c / t + t) / 2.0;
            }
            System.out.println("\n The Absolute value is "+t);
        }
        else
            System.out.println("\n you entered negative number!!!");
    }

}
