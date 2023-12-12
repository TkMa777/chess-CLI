package org.example.piece;


import org.example.Board;
import org.example.Color;
import org.example.Coordinates;

import java.util.HashSet;
import java.util.Set;

// La classe abstraite sera la classe de base pour toutes les autres Pieces
abstract public class Piece {

    public final Color color;

    public Coordinates coordinates;

    public Piece(Color color, Coordinates coordinates) {
        this.color = color;
        this.coordinates = coordinates;
    }

    // Nous choisissons set, et pas list. car chaque coordinate est unique et ne peut pas avoir de doublons
    public Set<Coordinates> getAvailableMoveSquares(Board board) {
        Set<Coordinates> result = new HashSet<>();

        for (CoordinatesShift shift : getPieceMoves()) {
            if (coordinates.canShift(shift)) {
                Coordinates newCoordinates = coordinates.shift(shift);

                if(isSquareAvailableForMove(newCoordinates, board)) {
                    result.add(newCoordinates);
                }
            }
        }
        return result;
    }


    // ce method sera commun à tous sauf le Roi
    private boolean isSquareAvailableForMove(Coordinates newCoordinates, Board board) {
        return board.isSquareEmpty(newCoordinates) || !board.getPiece(newCoordinates).color.equals(color);
    }



    // la méthode est créée spécifiquement pour être implémentée dans les child classes
    protected abstract Set<CoordinatesShift> getPieceMoves();
}
