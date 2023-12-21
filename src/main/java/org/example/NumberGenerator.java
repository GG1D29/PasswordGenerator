package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;
import java.util.Scanner;

public class NumberGenerator {
    private static final Logger logger = LogManager.getLogger(NumberGenerator.class);
    private static final int UPPER_BOUND = 12;
    private static final int DELAY_BETWEEN_NUMBER = 1241;

    public static void main(String[] args) throws Exception {
        // Initiate a new Scanner
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("How many random numbers do you want?\n");
        int numbers = userInputScanner.nextInt();

        for (int i = 0; i < numbers; i++) {
            Random rand = new Random(System.currentTimeMillis());
            int num = rand.nextInt(UPPER_BOUND) + 1;
            logger.info("random number {} is {}", i + 1, num);
            Thread.sleep(DELAY_BETWEEN_NUMBER);
        }

    }
}
