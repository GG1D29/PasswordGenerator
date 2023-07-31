package org.example;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String args[]) {

        // Initiate a new Scanner
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("How many password combination do you want? ");
        int numberOfPass = userInputScanner.nextInt();
        Random rand = new Random();

        String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder pass = new StringBuilder();

        while (numberOfPass > 0) {
            //8-character length, first char upper case
            pass.append(charset.charAt(rand.nextInt(charset.indexOf("Z") + 1)));

            for (int i = 1; i < 8; i++) {
                int index =
                        rand.nextInt(charset.length() - charset.indexOf("a")) + charset.indexOf("a");
                pass.append(charset.charAt(index));
            }

            System.out.println(pass.toString());
            pass.setLength(0);
            numberOfPass--;
        }
    }
}