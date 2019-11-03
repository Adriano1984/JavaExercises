package com.calc;

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
        byte years = scanner.nextByte();
        int nPayments = years * 12; //12 months in a  year, pay each month

        double mortgage = principal
                * (interestMonthly * Math.pow((1 + interestMonthly), nPayments))
                / (Math.pow((1 + interestMonthly), nPayments)- 1);

        String mortgageFormatted =NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.print("Mortgage: " + mortgageFormatted);

    }
}
