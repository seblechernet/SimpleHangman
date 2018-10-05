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
        char[] guess = new char[theWord.length()];
        int count =1;
do {
    System.out.println("Enter the letter");
    char aletter = sc.next().charAt(0);

    for (int i = 0; i < letters.length; i++) {

        if ((aletter == letters[i])) {
            guess[i] = aletter;
        } else
            guess[i] = '_';

    }
    System.out.println("Your guess so far");
    for (char a : guess) {
        System.out.print(a + "  ");

    }
    count++;
}while(count<guess.length);


    }
}
