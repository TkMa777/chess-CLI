package org.example;

import java.util.HashMap;

/*
nous ne sélectionnons pas un double tableau,
car toutes les cellules vides du tableau doivent être remplies
*/

public class Board {
    HashMap<Coordinates, Piece> pieces = new HashMap<>();

    public void setPieces(Piece piece, Coordinates coordinates) {
        piece.coordinates = coordinates;
        pieces.put(coordinates, piece);
    }

}
