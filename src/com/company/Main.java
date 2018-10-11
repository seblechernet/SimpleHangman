package com.company;

import java.io.Console;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Create an arraylist of words to guess
        ArrayList<String> words = new ArrayList<>();
        words.add("tree");
        words.add("rain");
        words.add("bear");
        words.add("encourage");
        words.add("promise");
        words.add("soup");
        words.add("chess");
        words.add("insurance");
        words.add("pancakes");
        words.add("stream");
//Genearte a random number to use it as an index for the random word for the game
        Random rd = new Random();
        int index = rd.nextInt(words.size());
//Assign a variable that will hold the word
        String theWord = words.get(index);
//Create an array called letters that will hold the letters of the word
// and to compare each letter with the user's guess
        char[] letters = new char[theWord.length()];
        letters = theWord.toCharArray();
//Create an array of characters to hold the guesses of the user so far

        Character[] guess = new Character[theWord.length()];
        int count = 1;

        do {
// Declare a boolean variable to check if the guess if incorrect
            boolean incorrect = true;
// Declare  a boolean variable to check if the any element is null
            boolean isNull = false;
            System.out.println("\nEnter the letter");
            char aletter = sc.next().charAt(0);

            for (int i = 0; i < letters.length; i++) {
//If the guessed letter matches with any of the letters in the word
// then add that letter in the guess array and make incorrect false
                if ((aletter == letters[i])) {
                    guess[i] = aletter;
                    incorrect = false;
                }
            }
// If incorrect is still true that means there  is no match of the guessed letter in the word add one to the count
            if (incorrect == true) {
                System.out.println("You have guessed incorrectly " + count + "/6 times");
                count++;
            }
// Tell the user what their guesses so far are by looping through the guess array and print the letter if is known
// and print "_" if the letter is still unknown
            System.out.println("Your guess so far");
            for (int i = 0; i < guess.length; i++) {
                if (guess[i] != null) {
                    System.out.print(guess[i] + "  ");
                } else
                    System.out.print(" _ ");
            }
            for (Character each : guess) {
//If any element of the guess is null=> isNull=true
                if (each == null) {
                    isNull = true;
                    break;
                }
            }
// If isNull is false that means there is no null element and all the words are known
            if (isNull == false) {
                System.out.println("You have WON!!!!!!!!");
                break;
            }
// If the count is 6  break the while loop
            if (count == 6) {
                System.out.println("Sorry, you have no more guesses left. The word was " + theWord);
                break;
            }
        } while (count < 6);


    }
}
