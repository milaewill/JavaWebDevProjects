package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;


public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    //getters and setters

    public ArrayList<MenuItem> getMenuItems() {
            return menuItems;
    }

    @Override
    public String toString() {
        StringBuilder appetizer = new StringBuilder();
        for (MenuItem item: menuItems) {
            if (item.getCategory().equals("appetizer")) {
                appetizer.append("\n").append(item.toString()).append("\n");
            }
        } StringBuilder entree = new StringBuilder();
        for (MenuItem item: menuItems) {
            if (item.getCategory().equals("entree")) {
                entree.append("\n").append(item.toString()).append("\n");
            }
        }StringBuilder dessert = new StringBuilder();
        for (MenuItem item: menuItems) {
            if (item.getCategory().equals("dessert")) {
                dessert.append("\n").append(item.toString()).append("\n");
            }

        }
        return "\nItaliana\n" +
                "APPETIZERS" + appetizer.toString() + "\n" +
                "ENTREES" + entree.toString() + "\n" +
                "DESSERTS" + dessert.toString() + "\n";

    }

    void addItem(MenuItem newItem) {
        String message = "Item is already on the menu.";
        if (menuItems.contains(newItem)) {
            System.out.println(message);
            return;
        }
        for (MenuItem item : menuItems) {
            if(item.equals(newItem)) {
                System.out.println(message);
                return;

            }
        }

        menuItems.add(newItem);
        lastUpdated = LocalDate.now();
    }

    void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }


}


