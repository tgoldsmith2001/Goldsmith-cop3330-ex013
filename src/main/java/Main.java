/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the principal: ");
        String Str1=input.nextLine();
        System.out.print("Enter the rate of interest: ");
        String Str2=input.nextLine();
        System.out.print("Enter the number of years: ");
        String Str3=input.nextLine();
        System.out.print("What is the number of times it is compounded per year: ");
        String Str4=input.nextLine();
        double P= Double.parseDouble(Str1);
        double R= (Double.parseDouble(Str2));
        double T= Double.parseDouble(Str3);
        double N= Double.parseDouble(Str4);
        double Total=Round_up(P*Math.pow((1+(R/N/100)),N*T));
        System.out.format("$%.2f invested at %.2f%% for %.0f years compounded %.0f times " +
                "per year is $%.2f.",P,R,T,N,Total);
    }
    //A function that uses a base 10 system to round a number up to 2 decimal places (up to next penny)
    public static double Round_up(double num){
        //Convert number to string
        String n=String.valueOf(num);
        double Ret=0;
        int decimal=n.indexOf('.');
        //Remove decimal from string for the purpose of calculations
        String N=n.replace(".","");
        for (int i = 0; i <= decimal+1; i++) {
            //Checks for case where there aren't two decimal places
            if(i==N.length()){
                break;
            }
            //Gets value at specific decimal index
            int decimal_value=Character.getNumericValue((N.charAt(i)));
            //Case where i is at location to be rounded up
            if(i==decimal+1)
                decimal_value+=1;
            //Adds decimal at index i to return by a factor of 10^(i-1)
            Ret+=(Math.pow(10,decimal-i-1))*decimal_value;
        }
        return Ret;
    }
}