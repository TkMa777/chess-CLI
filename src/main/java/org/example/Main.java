package org.example;

import org.example.piece.Piece;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.setupDefaultPiecesPositions();

        BoardConsoleRenderer boardConsoleRenderer = new BoardConsoleRenderer();
        boardConsoleRenderer.render(board);

        Piece piece = board.getPiece(new Coordinates(File.G, 8));

        Set<Coordinates> availableMoveSquares = piece.getAvailableMoveSquares(board);

        int a = 23;
    }
}