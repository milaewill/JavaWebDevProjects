package org.launchcode;


public class Main {

    public static void main(String[] args) {
        // write your code here

        //menu items
        MenuItem item1 = new MenuItem("toasted ravioli", "a classic stl dish", 14, "appetizer");
        MenuItem item2 = new MenuItem("spaghetti and meatballs", "fresh pasta", 23, "entree");
        MenuItem item3 = new MenuItem("tiramisu", "creamy and delicious", 12, "dessert");

        //print item
        System.out.println(item1);

        //create menu
        Menu menu = new Menu();


        //add items to the menu
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);

        //print menu
        System.out.println(menu);

        //remove item
        menu.removeItem(item3);
        System.out.println(menu);

        //equals method test
        System.out.println(item1.equals(item2));


        //attempting duplicate item

        MenuItem item4 = new MenuItem("Buratta", "creamy cheese ball", 17,"appetizer");

        System.out.println(item3.equals(item4));

        menu.addItem(item4);
        System.out.println(menu);

        menu.addItem(item1);
        System.out.println(menu);


    }

}
