package com.raphael.demo.pseudorandomnumber;

public class MathRandomDemo {

    public static void main(String[] args) {

        // Generate and print 5 random numbers between 0 and 1
        for (int i = 0; i < 5; i++) {
            double randomValue = (int) (Math.random() * 1000) + 1;
            System.out.println("Random number: " + randomValue);
        }
    }
}
