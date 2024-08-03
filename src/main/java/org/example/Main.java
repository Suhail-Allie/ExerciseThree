package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Array to store counts for numbers 1-100
        int[] counts = new int[101];

        // Read numbers from the user until 0 is entered
        System.out.println("Enter numbers between 1 and 100 (0 to stop):");
        while (true) {
            int number = input.nextInt();
            // Exit the loop when 0 is entered
            if (number == 0) {
                break;
            }
            if (number >= 1 && number <= 100) {
                counts[number]++;
            }
        }

        // Display the counts
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println(i + " occurs " + counts[i] + " time" + (counts[i] > 1 ? "s" : ""));
            }
        }

        input.close();
    }
}