package com.raphael.demo.pseudorandomnumber;

import java.text.DecimalFormat;
import java.util.Random;

public class EnhancedRandomAnimalSimulator {

    private static final long SEED = 123456789L; // Set a fixed seed for reproducibility

    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        Random random = new Random(SEED);

        // Simulate animal behavior using random numbers
        for (int i = 0; i < 10; i++) {
            double movement = random.nextDouble() * 10; // Generate a random movement value between 0 and 10
            String formattedMovement = decimalFormat.format(movement);
            System.out.println("Animal moved: " + formattedMovement);
        }
    }
}