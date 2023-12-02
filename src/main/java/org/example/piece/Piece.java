package org.example.piece;


import org.example.Color;
import org.example.Coordinates;

// La classe abstraite sera la classe de base pour toutes les autres Pieces
abstract public class Piece {

    public final Color color;

    public Coordinates coordinates;

    public Piece(Color color, Coordinates coordinates) {
        this.color = color;
        this.coordinates = coordinates;
    }
}
