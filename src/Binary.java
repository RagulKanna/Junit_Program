package com.Assignment;

import java.util.Scanner;

public class Binary {
    public static int num;
    public static void main( String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to convert as binary: ");
        num=sc.nextInt();
        sc.close();
        bin(num);
    }
    public static void bin(int value) {
        int a[] = new int[100];
        int j = 0;
        while (value > 0) {
            a[j++] = value % 2;
            value = value / 2;
        }
        StringBuffer sb =new StringBuffer();

        for (int i = j - 1; i >= 0; i--) {
            sb.append(a[i]);
        }
        String bn=sb.toString();
        if(sb.length() == 1)
        {
            String str="000";
            bn=str.concat(bn);
            System.out.println("The Binary value of " + num + " is "+bn);
        }else if(sb.length() == 2)
        {
            String str="00";
            bn=str.concat(bn);
            System.out.println("The Binary value of " + num + " is "+bn);
        }else if(sb.length() == 3)
        {
            String str="0";
            bn=str.concat(bn);
            System.out.println("The Binary value of " + num + " is "+bn);
        }
        else
            System.out.println("The Binary value of " + num + " is "+bn);
    }
}