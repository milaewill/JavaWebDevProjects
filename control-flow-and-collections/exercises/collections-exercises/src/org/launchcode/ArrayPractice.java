package org.launchcode;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] integerArray = {1, 1, 2, 3, 5, 8};

        for( int value : integerArray) {
            System.out.println(value);
        }

        for (int value : integerArray) {
            if (value % 2 != 0) {
                System.out.println(value);
            }
        }

        String phrase = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not " +
                "eat them in a house. I will not eat them with a mouse.";

        String[] wordsArray = phrase.split(" ");
        System.out.println(Arrays.toString(wordsArray));

        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));





    }
}
