package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();


        Comparator comparator = new FlavorComparator();

        flavors.sort(comparator);

        Comparator<Cone> costComparator = new ConeComparator();
        cones.sort(costComparator);


        Comparator<Flavor> allergenComparator = new FlavorComparator();
        flavors.sort(allergenComparator);





        System.out.println("Sorted Flavors:");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName() + " - Allergens: " + flavor.getAllergens());
        }

        System.out.println("\nSorted Cones:");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": $" + cone.getCost());
        }

        System.out.println("Sorted Toppings:");
        for (Topping topping : toppings) {
            System.out.println(topping.getName());
        }


        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.


    }
}