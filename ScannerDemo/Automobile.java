package ScannerDemo;

/* Write a program that prompts the capacity, in gallons, of an automobile fuel
tank and the miles per gallons the automobile can be driven. The program
outputs the number of miles the automobile can be driven without refueling. */

import java.util.*;

public class Automobile
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        double fuelTankCapacity;
        double milesPerGallon;

        System.out.print("Enter the fuel tank capacity in gallons: ");
        fuelTankCapacity = console.nextDouble();
        System.out.println();

        System.out.print("Enter the miles per gallon: ");
        milesPerGallon = console.nextDouble();
        System.out.println();

        System.out.println("The number of miles the car can be driven is "
                          + fuelTankCapacity *  milesPerGallon
                          + " miles.");
    }
}
