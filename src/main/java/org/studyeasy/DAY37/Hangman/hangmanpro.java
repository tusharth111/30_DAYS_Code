package org.studyeasy.DAY37.Hangman;

import java.util.ArrayList;
import java.util.Scanner;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  24 1/24/2026 12:04 PM
 Project Name : 30Days_Java
 ***/
public class hangmanpro {
    public static void main(String[] args) {
        String word = "pizza";
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();

        int wrongGuesses = 0;
        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }
        System.out.println("************");
        System.out.println("Welcome to hangman");
        System.out.println("************");
        while(wrongGuesses < 6){
            System.out.println(getHangman(wrongGuesses));
            System.out.print("Word: ");
            for(char c :wordState){
                System.out.print(c + " ");
            }
            System.out.println();
            if(!wordState.contains('_')){
                System.out.println("You have won");
                break;
            }

            System.out.print("Guess a letter ");
            char guess  = sc.next().toLowerCase().charAt(0);
            if(word.indexOf(guess) >=0)
            {
                System.out.println("Correct guess");
                for(int i =0;i<word.length();i++){
                    if(word.charAt(i) == guess){
                        wordState.set(i,guess);
                    }
                }
            }else
            {
                System.out.println("Wrong Guess");
                wrongGuesses++;
            }
        }
        if(wrongGuesses >= 6){
            System.out.print(getHangman(wrongGuesses));
            System.out.println("Game Over!");
            System.out.println("The word was : "+word);
        }

    }
    static String getHangman(int wrongGuesses){
        return switch (wrongGuesses){
            case 0 -> """
                    """;
            case 1 -> """
                    o
                    
                    """;
            case 2 -> """
                    o
                    |
                    
                    """;
            case 3 -> """
                    o
                    |\\
                    """;
            case 4 -> """
                     o
                    /|\\
                    """;
            case 5 -> """
                     o
                    /|\\
                     |
                    """;
            case 6 -> """
                     o
                    /|\\
                     |
                      \\
                    """;
            default -> "";
        };
    }
}
