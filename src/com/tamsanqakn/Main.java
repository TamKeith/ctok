package com.tamsanqakn;

import java.util.Scanner;

public class Main {

    static double kelvin = 0;
    static double celcius = 0;

    public static void main(String[] args) {

        boolean quit = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the ****Celcius to Kelvin Converter****");

        while(!quit) {

            System.out.println("Enter the Temperature in Celcius: ");

            boolean isANumber = scanner.hasNextDouble();

            if(isANumber) {

                String input = scanner.nextLine();
                celcius = Double.parseDouble(input);
                kelvin = celcius + 273.15;
                String strKelvin = String.format("%.2f", kelvin);
                System.out.println(celcius + " Degrees Celcius is = " + strKelvin + " Kelvin");
                boolean stop = false;
                int choice;



            } else {
                scanner.nextLine();
                System.out.println("Please Enter a Numeric value for the Temperature");
            }
        }
        scanner.close();
        System.out.println("Thank You for using the ****Celcius to Kelvin Converter****. Bye");
    }
}
