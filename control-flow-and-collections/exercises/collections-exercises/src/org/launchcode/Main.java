package org.launchcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // The list of words
        List<String> wordsList = List.of(
                "would", "could", "box", "with", "house", "mouse", "other"
        );

        // Prompt the user to enter the word length
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word length to search: ");
        int wordLength = scanner.nextInt();

        // Print words with the specified length
        printWordsWithGivenLength(wordsList, wordLength);
    }

    // Static method to print words with the specified length
    private static void printWordsWithGivenLength(List<String> words, int length) {
        System.out.println("Words with exactly " + length + " letters:");
        for (String word : words) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
}




