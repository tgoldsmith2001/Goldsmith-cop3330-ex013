/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        String Str1 = input.nextLine();
        System.out.print("Enter the rate of interest: ");
        String Str2 = input.nextLine();
        System.out.print("Enter the number of years: ");
        String Str3 = input.nextLine();
        System.out.print("What is the number of times it is compounded per year: ");
        String Str4 = input.nextLine();
        double P = Double.parseDouble(Str1);
        double R = (Double.parseDouble(Str2));
        double T = Double.parseDouble(Str3);
        double N = Double.parseDouble(Str4);
        double total = P * Math.pow((1 + (R / N / 100)), N * T);
        //Multiply by 100, round then divide by 100 to round to 2 decimal places
        double rounded_Total = Math.round(total * 100.0) / 100.0;
        System.out.format("$%.2f invested at %.2f%% for %.0f years compounded %.0f times " +
                "per year is $%.2f.", P, R, T, N, rounded_Total);
    }
}
