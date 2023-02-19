package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int SLICE = 4;
        Scanner scanner = new Scanner(System.in);


        int T = scanner.nextInt();

        int people = scanner.nextInt();

        int slices = scanner.nextInt();

        int totalSlices = people * slices;

        int pizza = (totalSlices + 4 - 1) / 4;


        System.out.println(pizza);
    }

}
