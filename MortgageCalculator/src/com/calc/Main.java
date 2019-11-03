package com.test;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Scanner;

//Mortgage calculator
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float interestAnn = scanner.nextFloat();
        float interestMonthly = interestAnn / (12 * 100); //div by 100 because is percentage, 12 months in 1 year

        System.out.print("Period (Years): ");
        byte periodAnn = scanner.nextByte();
        int periodMonths = periodAnn * 12; //12 months in a  year

        double mortgage = principal * (interestMonthly * Math.pow((1 + interestMonthly), periodMonths)) / ((Math.pow((1 + interestMonthly), periodMonths)) - 1);
        NumberFormat mortgageFormatted = NumberFormat.getCurrencyInstance(mortgage).format();


        System.out.print("Mortgage: " + mortgageFormatted);

    }
}
