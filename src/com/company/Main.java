package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        Random generator = new Random();

        int MAX = 10000;
        int answer, guess;
        int numberOfGuesses = 0;
//        int guesses;
        String another;
        boolean flag;
        boolean anotherFlag = true;

        for (int i = 1; i < 10000; i++) {

        }
        answer = generator.nextInt(MAX) + 1;

        while (anotherFlag) {
            System.out.println("I'm thinking of a number between 1 and " + MAX + ". Can you guess what it is?");
//            guesses = sc.nextInt();
//
//            String[] attempts = new String[guesses];
//
//            for (int counter = 0; counter < guesses; counter++) {
//                System.out.println("Your guesses so far are " + (counter+1));
//            }
            flag = false;
            while (!flag) {
                guess = sc.nextInt();

                numberOfGuesses = numberOfGuesses + 1;
                if (guess == answer) {
                    System.out.println("You guessed correctly!  Great Job! You guessed the number in " + numberOfGuesses + " tries.");
                    flag = true;
                } else if (guess > answer) {
                    System.out.println("That is not the correct number, sorry. My number is lower than " + guess + ". Try again.");
                    System.out.println("Your range is between " + (guess - 1) + " and 1.");
                } else if (guess < answer) {
                    System.out.println("That is not the correct number, sorry. My number is higher than " + guess + ". Try again.");
                    System.out.println("Your range is between " + (guess + 1) + " and " + MAX + ".");
                }
            } //End of inner while loop
            System.out.println(" ");
            System.out.println("Would you like ot play again (y/n)?");
            another = sc.next();
            if (another.equalsIgnoreCase("y")) {

                anotherFlag = true;
            } else {
                anotherFlag = false;
                System.out.println("Thanks for playing! Goodbye!");
            }
        }

    }
}




