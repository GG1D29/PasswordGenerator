package org.example;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    private static final String CHARSETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int MAX_LENGTH = 8;

    public static void main(String[] args) {

        // Initiate a new Scanner
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("How many password combination do you want?\n");
        int numberOfPass = userInputScanner.nextInt();
        Random rand = new Random();

        StringBuilder pass = new StringBuilder();
        while (numberOfPass > 0) {

            int upperBoundIndexForUppercase = CHARSETS.indexOf("Z") + 1;
            int randomizedUppercaseIndex = rand.nextInt(upperBoundIndexForUppercase);
            pass.append(CHARSETS.charAt(randomizedUppercaseIndex));

            int lowerBoundIndexForLowercase = CHARSETS.indexOf("a");
            for (int i = 1; i < MAX_LENGTH; i++) {
                int nextIndex = rand.nextInt(CHARSETS.length() - lowerBoundIndexForLowercase) + lowerBoundIndexForLowercase;
                pass.append(CHARSETS.charAt(nextIndex));
            }

            System.out.println(pass);
            pass.setLength(0);
            numberOfPass--;
        }
    }
}