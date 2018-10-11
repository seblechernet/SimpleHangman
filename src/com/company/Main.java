package com.company;

import java.io.Console;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        Random rd = new Random();
        int index = rd.nextInt(words.size());
        String theWord = words.get(index);
        System.out.println(theWord);
        char[] letters = new char[theWord.length()];
        letters = theWord.toCharArray();
        Character[] guess = new Character[theWord.length()];
        int count = 1;


        do {
            boolean incorrect = true;
            boolean cont=false;
            System.out.println("\nEnter the letter");
            char aletter = sc.next().charAt(0);

            for (int i = 0; i < letters.length; i++) {

                if ((aletter == letters[i])) {
                    guess[i] = aletter;
                    incorrect = false;

                }

            }
            for (Character each : guess) {
                if (each == null) {
                    cont=true;
                    break;
                }

            }
            if (incorrect == true) {
                System.out.println("You have guessed incorrectly " + count + "/6 times");
                count++;

            }
            System.out.println("Your guess so far");
            for (int i = 0; i < guess.length; i++) {
                if (guess[i] != null) {
                    System.out.print(guess[i] + "  ");
                } else
                    System.out.print(" _ ");
            }
            if (count == 6) {
                System.out.println("Sorry, you have no more guesses left. The word was " + theWord);
                break;
            }
            if (cont==false){
                System.out.println("You have WON!!!!!!!!");
                break;
            }



        } while (count<6);


    }
}
