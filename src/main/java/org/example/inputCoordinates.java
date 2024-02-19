package org.example;

import java.util.Scanner;

public class inputCoordinates {

    Scanner scanner = new Scanner(System.in);

    public Coordinates input() {
        while (true) {
            System.out.println("Please enter coordinates (ex. a1)");

            String line = scanner.nextLine();

            if (line.length() != 2) {
                System.out.println("Invalid format");
            }

            char fileChar = line.charAt(0);
            char rankChar = line.charAt(1);

            if (!Character.isLetter(fileChar)) {
                System.out.println("Invalid format");
            }

            if (!Character.isDigit(rankChar)) {
                System.out.println("Invalid format");
            }

            int rank = Integer.valueOf(rankChar);
            if (rank < 1 || rank > 8) {
                System.out.println("Invalid formatt");
            }

            File file = File.fromChar(fileChar);
            if (file == null) {
                System.out.println("Invalid file format");
            }
        }
    }


}
