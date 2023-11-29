package org.launchcode;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister" +
                " on the bank, and of having nothing to do: once or twice she had peeped into the book" +
                " her sister was reading, but it had no pictures or conversations in it, ‘and what is the " +
                "use of a book,’ thought Alice ‘without pictures or conversation?’";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a term to search for: ");
        String searchTerm = scanner.nextLine();

        boolean termFound = sentence.toLowerCase().contains(searchTerm.toLowerCase());

        //System.out.println("Search term '" + searchTerm + "' " +
        //        (termFound ? "was found" : "was not found") + " in the sentence");


        if (termFound) {
            int index = sentence.toLowerCase().indexOf(searchTerm.toLowerCase());
            int length = searchTerm.length();

            System.out.println("Search term '" + searchTerm + "' found at index: " + index);
            System.out.println("Length of the search term: " + length);

            sentence = sentence.substring( 0, index) + sentence.substring(index +length);
            System.out.print( "Updated Sentence: " +sentence );

        } else {
            System.out.print( "Search Term:  " + searchTerm + " was not found" );
        }


        scanner.close();

    }

}
