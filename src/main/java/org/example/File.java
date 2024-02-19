package org.example;


/*
nous choisissons enum et non char,
car il ne peut y avoir rien de plus à part ces lettres
 */

public enum File {
    A, B, C, D, E, F, G, H;

    public static File fromChar(char c) {
        try {
            return File.valueOf(String.valueOf(c).toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

}
