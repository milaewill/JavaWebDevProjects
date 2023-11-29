package org.launchcode;

 import java.util.Scanner;

 public class NumOfMiles {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.print("How many miles have you driven? ");
         double numMiles = scanner.nextDouble();

         System.out.print("How much gas did you use? In gallons. ");
         double numGallons = scanner.nextDouble();
         double milesPerGallon = numMiles / numGallons;

         System.out.print("You used " + numGallons + " gallons and you traveled " + numMiles + " miles. " +
                 "Your mpg is: " + milesPerGallon + "!");


     }
 }
