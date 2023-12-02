package org.example;

import org.example.piece.Pawn;
import org.example.piece.Piece;

import java.util.HashMap;

/*
nous ne sélectionnons pas un double array,
car toutes les cellules vides du tableau doivent être remplies
*/

public class Board {
    HashMap<Coordinates, Piece> pieces = new HashMap<>();

    public void setPieces(Coordinates coordinates, Piece piece) {
        piece.coordinates = coordinates;
        pieces.put(coordinates, piece);
    }

    public void setupDefaultPiecesPositions() {
        for (File file : File.values()) {
            setPieces(new Coordinates(file, 2), new Pawn(Color.WHITE, new Coordinates(file, 2)));
            setPieces(new Coordinates(file, 7), new Pawn(Color.BLACK, new Coordinates(file, 7)));
        }
    }
}
