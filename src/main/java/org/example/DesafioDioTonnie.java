package org.example;

import java.util.Scanner;

public class DesafioDioTonnie {
    public static void main(String[] args) {
        final int SLICE = 4;
        Scanner scanner = new Scanner(System.in);

            System.out.println("How many friends are there?");
        int T = scanner.nextInt();
        System.out.println("How many slices of pizza do they want?");
        int N = scanner.nextInt();

        System.out.println("You have to order " + T * N / 4 + " pizza.");
    }
}
