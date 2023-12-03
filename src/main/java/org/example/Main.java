package org.example;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.setupDefaultPiecesPositions();

        BoardConsoleRenderer boardConsoleRenderer = new BoardConsoleRenderer();
        boardConsoleRenderer.render(board);

    }
}