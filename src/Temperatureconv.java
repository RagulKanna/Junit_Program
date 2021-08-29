package com.Assignment;

import java.util.Scanner;

public class Temperatureconv {
    public static float c,f;
    public static int ch;
    public static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\n Enter the conversion u need:");
        System.out.println("\n 1 for Celsius ---> Fahrenheit");
        System.out.println(" 2 for Fahrenheit -----> Celsius\n");
        ch=sc.nextInt();
        temperatureconversion();
    }
    public static void temperatureconversion()
    {
        if (ch == 1) {
            System.out.println("\n Conversion from Celsius ---> Fahrenheit ");
            System.out.println("\n\n Enter the value of celcius:");
            c = sc.nextFloat();
            float fresult = (c * 9 / 5) + 32;
            System.out.println("\n Thw Fahrenheit Temperature value is "+fresult);
        }
        else if(ch == 2) {
            System.out.println("\n Conversion from Celsius ---> Fahrenheit ");
            System.out.println("\n\n Enter the value of celcius:");
            f = sc.nextFloat();
            float cresult = (f - 32) * 5 / 9;
            System.out.println("\n The Celcius Temperature value is "+cresult);
        }
        else
            System.out.println("\n You Entered wrong choice!!!");
    }
}
